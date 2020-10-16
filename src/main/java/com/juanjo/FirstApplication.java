package com.juanjo;

import io.nem.symbol.sdk.api.RepositoryFactory;

import io.nem.symbol.sdk.api.TransactionRepository;
import io.nem.symbol.sdk.infrastructure.vertx.RepositoryFactoryVertxImpl;
import io.nem.symbol.sdk.model.account.Account;
import io.nem.symbol.sdk.model.account.Address;
import io.nem.symbol.sdk.model.account.UnresolvedAddress;
import io.nem.symbol.sdk.model.message.PlainMessage;
import io.nem.symbol.sdk.model.mosaic.Mosaic;
import io.nem.symbol.sdk.model.mosaic.MosaicId;
import io.nem.symbol.sdk.model.network.NetworkType;
import io.nem.symbol.sdk.model.transaction.SignedTransaction;
import io.nem.symbol.sdk.model.transaction.TransferTransaction;
import io.nem.symbol.sdk.model.transaction.TransferTransactionFactory;

import java.math.BigInteger;
import java.util.Collections;
import java.util.concurrent.ExecutionException;

public class FirstApplication {

    public static void main(String[] args) {
        try {
            firstApplication();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    static void firstApplication()
            throws ExecutionException, InterruptedException {

        /* Start block 01 */
        // replace with node endpoint
        try (final RepositoryFactory repositoryFactory = new RepositoryFactoryVertxImpl(
                "http://api-01.eu-west-1.0.10.0.x.symboldev.network:3000")) {
                // http://api-01.eu-west-1.0.10.0.x.symboldev.network:3000-api-01-eu-west-1")) {
            // replace with mosaic ID
            final String mosaicIdHex = "64D77034A6EE97FB";
            final MosaicId mosaicId = new MosaicId(mosaicIdHex);

            //replace with customer address
            final String rawAddress = "TB2677-X3UIBH-SDEUHO-2OUGFN-PHJ7H2-TVCOP6-7AI";
            final UnresolvedAddress recipientAddress = Address.createFromRawAddress(rawAddress);
            final NetworkType networkType = repositoryFactory.getNetworkType().toFuture().get();

            final Mosaic mosaic = new Mosaic(mosaicId, BigInteger.valueOf(1));
            final TransferTransaction transferTransaction = TransferTransactionFactory
                    .create(
                            networkType,
                            recipientAddress,
                            Collections.singletonList(mosaic))
                            // PlainMessage.create("Enjoy your ticket"))
                    .maxFee(BigInteger.valueOf(2000000)).build();
            /* end block 01 */

            /* start block 02 */
            // replace with ticket vendor private key
            final String privateKey = "B27D8C570295F64BF24370312774493338BCAF9DB0895EB2C9713BA14013F672";
            // replace with network generation hash
            final String generationHash = repositoryFactory.getGenerationHash().toFuture().get();

            final Account account = Account
                    .createFromPrivateKey(privateKey, networkType);
            final SignedTransaction signedTransaction = account
                    .sign(transferTransaction, generationHash);
            /* end block 02 */

            /* start block 03 */
            final TransactionRepository transactionRepository = repositoryFactory
                    .createTransactionRepository();
            transactionRepository.announce(signedTransaction).toFuture().get();
            /* end block 03 */
        }
    }
}
