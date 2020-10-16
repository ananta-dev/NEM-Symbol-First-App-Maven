First-App-Maven


After trying with gradle and getting stuck with building due to issue with JUnit 5, and unable to fix this in gradle I decided to use Maven.
I also decided not to import JUnit as I am simply playing to get familiar. 

With Maven and without JUnit, I can build, but I get an error during execution.

Here's copy paste of the error message:

----------------------------------------------

"C:\Program Files\Java\jdk1.8.0_261\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2019.3.3\lib\idea_rt.jar=62675:C:\Program Files\JetBrains\IntelliJ IDEA 2019.3.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_261\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\rt.jar;C:\git\NEM-Symbol\First-App-Maven\target\classes;C:\Users\juang\.m2\repository\io\nem\symbol-sdk-vertx-client\0.20.3\symbol-sdk-vertx-client-0.20.3.jar;C:\Users\juang\.m2\repository\io\nem\symbol-sdk-core\0.20.3\symbol-sdk-core-0.20.3.jar;C:\Users\juang\.m2\repository\io\reactivex\rxjava2\rxjava\2.1.7\rxjava-2.1.7.jar;C:\Users\juang\.m2\repository\io\nem\catbuffer-java\0.0.22\catbuffer-java-0.0.22.jar;C:\Users\juang\.m2\repository\org\bouncycastle\bcprov-jdk15on\1.58\bcprov-jdk15on-1.58.jar;C:\Users\juang\.m2\repository\commons-codec\commons-codec\1.11\commons-codec-1.11.jar;C:\Users\juang\.m2\repository\org\apache\commons\commons-lang3\3.9\commons-lang3-3.9.jar;C:\Users\juang\.m2\repository\org\apache\commons\commons-math3\3.2\commons-math3-3.2.jar;C:\Users\juang\.m2\repository\commons-io\commons-io\2.4\commons-io-2.4.jar;C:\Users\juang\.m2\repository\com\googlecode\javaewah\JavaEWAH\1.0.0\JavaEWAH-1.0.0.jar;C:\Users\juang\.m2\repository\io\nem\symbol-openapi-vertx-client\0.9.6\symbol-openapi-vertx-client-0.9.6.jar;C:\Users\juang\.m2\repository\javax\annotation\javax.annotation-api\1.3.2\javax.annotation-api-1.3.2.jar;C:\Users\juang\.m2\repository\org\openapitools\jackson-databind-nullable\0.2.1\jackson-databind-nullable-0.2.1.jar;C:\Users\juang\.m2\repository\io\swagger\swagger-annotations\1.5.21\swagger-annotations-1.5.21.jar;C:\Users\juang\.m2\repository\com\google\code\findbugs\jsr305\3.0.2\jsr305-3.0.2.jar;C:\Users\juang\.m2\repository\io\vertx\vertx-web-client\3.4.2\vertx-web-client-3.4.2.jar;C:\Users\juang\.m2\repository\io\vertx\vertx-web-common\3.4.2\vertx-web-common-3.4.2.jar;C:\Users\juang\.m2\repository\io\vertx\vertx-rx-java\3.4.2\vertx-rx-java-3.4.2.jar;C:\Users\juang\.m2\repository\io\reactivex\rxjava\1.3.0\rxjava-1.3.0.jar;C:\Users\juang\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.10.3\jackson-core-2.10.3.jar;C:\Users\juang\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.10.3\jackson-annotations-2.10.3.jar;C:\Users\juang\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.10.3\jackson-databind-2.10.3.jar;C:\Users\juang\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.10.3\jackson-datatype-jsr310-2.10.3.jar;C:\Users\juang\.m2\repository\io\vertx\vertx-rx-java2\3.5.0\vertx-rx-java2-3.5.0.jar;C:\Users\juang\.m2\repository\org\reactivestreams\reactive-streams\1.0.1\reactive-streams-1.0.1.jar;C:\Users\juang\.m2\repository\io\vertx\vertx-core\3.5.0\vertx-core-3.5.0.jar;C:\Users\juang\.m2\repository\io\netty\netty-common\4.1.15.Final\netty-common-4.1.15.Final.jar;C:\Users\juang\.m2\repository\io\netty\netty-buffer\4.1.15.Final\netty-buffer-4.1.15.Final.jar;C:\Users\juang\.m2\repository\io\netty\netty-transport\4.1.15.Final\netty-transport-4.1.15.Final.jar;C:\Users\juang\.m2\repository\io\netty\netty-handler\4.1.15.Final\netty-handler-4.1.15.Final.jar;C:\Users\juang\.m2\repository\io\netty\netty-codec\4.1.15.Final\netty-codec-4.1.15.Final.jar;C:\Users\juang\.m2\repository\io\netty\netty-handler-proxy\4.1.15.Final\netty-handler-proxy-4.1.15.Final.jar;C:\Users\juang\.m2\repository\io\netty\netty-codec-socks\4.1.15.Final\netty-codec-socks-4.1.15.Final.jar;C:\Users\juang\.m2\repository\io\netty\netty-codec-http\4.1.15.Final\netty-codec-http-4.1.15.Final.jar;C:\Users\juang\.m2\repository\io\netty\netty-codec-http2\4.1.15.Final\netty-codec-http2-4.1.15.Final.jar;C:\Users\juang\.m2\repository\io\netty\netty-resolver\4.1.15.Final\netty-resolver-4.1.15.Final.jar;C:\Users\juang\.m2\repository\io\netty\netty-resolver-dns\4.1.15.Final\netty-resolver-dns-4.1.15.Final.jar;C:\Users\juang\.m2\repository\io\netty\netty-codec-dns\4.1.15.Final\netty-codec-dns-4.1.15.Final.jar;C:\Users\juang\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.9.9\jackson-datatype-jdk8-2.9.9.jar" com.juanjo.FirstApplication
java.util.concurrent.ExecutionException: io.nem.symbol.sdk.api.RepositoryCallException: ApiException: io.vertx.core.json.DecodeException: Failed to decode:Cannot construct instance of `io.nem.symbol.sdk.openapi.vertx.model.RolesTypeEnum`, problem: Unexpected value '6'
 at [Source: (String)"{"version":0,"publicKey":"389BBEC6A899A32CABD2CE55B3FCDF4E45FC12ED58161E6014B3EF9BA8FFE2FD","networkGenerationHashSeed":"6C1B92391CCB41C96478471C2634C111D9E989DECD66130C0430B5B8D20117CD","roles":6,"port":7900,"networkIdentifier":152,"host":"","friendlyName":"api-01-eu-west-1"}"; line: 1, column: 196] (through reference chain: io.nem.symbol.sdk.openapi.vertx.model.NodeInfoDTO["roles"]) - 0
	at io.reactivex.internal.observers.FutureObserver.get(FutureObserver.java:85)
	at com.juanjo.FirstApplication.firstApplication(FirstApplication.java:50)
	at com.juanjo.FirstApplication.main(FirstApplication.java:26)
Caused by: io.nem.symbol.sdk.api.RepositoryCallException: ApiException: io.vertx.core.json.DecodeException: Failed to decode:Cannot construct instance of `io.nem.symbol.sdk.openapi.vertx.model.RolesTypeEnum`, problem: Unexpected value '6'
 at [Source: (String)"{"version":0,"publicKey":"389BBEC6A899A32CABD2CE55B3FCDF4E45FC12ED58161E6014B3EF9BA8FFE2FD","networkGenerationHashSeed":"6C1B92391CCB41C96478471C2634C111D9E989DECD66130C0430B5B8D20117CD","roles":6,"port":7900,"networkIdentifier":152,"host":"","friendlyName":"api-01-eu-west-1"}"; line: 1, column: 196] (through reference chain: io.nem.symbol.sdk.openapi.vertx.model.NodeInfoDTO["roles"]) - 0
	at io.nem.symbol.sdk.infrastructure.vertx.AbstractRepositoryVertxImpl.exceptionHandling(AbstractRepositoryVertxImpl.java:74)
	at io.nem.symbol.sdk.infrastructure.vertx.AbstractRepositoryVertxImpl.lambda$onError$0(AbstractRepositoryVertxImpl.java:103)
	at io.reactivex.internal.operators.observable.ObservableOnErrorNext$OnErrorNextObserver.onError(ObservableOnErrorNext.java:91)
	at io.reactivex.internal.operators.single.SingleToObservable$SingleToObservableObserver.onError(SingleToObservable.java:65)
	at io.vertx.reactivex.core.impl.AsyncResultSingle.lambda$subscribeActual$0(AsyncResultSingle.java:46)
	at io.nem.symbol.sdk.openapi.vertx.invoker.ApiClient.lambda$buildResponseHandler$7(ApiClient.java:599)
	at io.vertx.ext.web.client.impl.HttpRequestImpl.lambda$null$1(HttpRequestImpl.java:238)
	at io.vertx.core.impl.ContextImpl.lambda$wrapTask$2(ContextImpl.java:344)
	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:163)
	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:403)
	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:463)
	at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:858)
	at java.lang.Thread.run(Thread.java:748)
Caused by: java.lang.IllegalArgumentException: Original call
	at io.nem.symbol.sdk.infrastructure.vertx.AbstractRepositoryVertxImpl.call(AbstractRepositoryVertxImpl.java:60)
	at io.nem.symbol.sdk.infrastructure.vertx.NetworkRepositoryVertxImpl.getNetworkType(NetworkRepositoryVertxImpl.java:90)
	at io.nem.symbol.sdk.infrastructure.RepositoryFactoryBase.lambda$new$0(RepositoryFactoryBase.java:81)
	at io.reactivex.internal.operators.observable.ObservableDefer.subscribeActual(ObservableDefer.java:32)
	at io.reactivex.Observable.subscribe(Observable.java:10981)
	at io.reactivex.internal.operators.observable.ObservableCache$CacheState.connect(ObservableCache.java:216)
	at io.reactivex.internal.operators.observable.ObservableCache.subscribeActual(ObservableCache.java:82)
	at io.reactivex.Observable.subscribe(Observable.java:10981)
	at io.reactivex.Observable.subscribeWith(Observable.java:11032)
	at io.reactivex.Observable.toFuture(Observable.java:5139)
	at com.juanjo.FirstApplication.firstApplication(FirstApplication.java:50)
	at com.juanjo.FirstApplication.main(FirstApplication.java:26)

Process finished with exit code 0


---------------------------------

Some account information:

Name		ticket-vendor
Importance	9498387240
Address		TBQJOE-P3F4LY-E7FXFG-HYWPGV-G6WAM6-6EERDV-KUI
Public Key	97891A6CEB8081FD6F4791D70328F40D09D55FF75EA0B84FB43C194E41A972FC
Private Key	******** Let me know if you need this.

Name		customer
Importance	9498314820
Address		TB2677-X3UIBH-SDEUHO-2OUGFN-PHJ7H2-TVCOP6-7AI
Public Key	8A1B967532BC62532E4FD94ACD8F3FDADE11613398781991956B60165FEDB04B
Private Key	******** Let me know if you need this.

The customer accout has 10,000 XYM

The ticket-vendor has the following assets

Assets
symbol.xym		9,999.461936
6DD76B0AE54835D7	100    >>> those are the tickets

