package snippet;

public class Snippet {
	Jan 02, 2025 6:40:11 PM org.openqa.selenium.remote.http.WebSocket$Listener onError
	WARNING: Connection reset
	java.net.SocketException: Connection reset
		at java.base/sun.nio.ch.SocketChannelImpl.throwConnectionReset(SocketChannelImpl.java:394)
		at java.base/sun.nio.ch.SocketChannelImpl.read(SocketChannelImpl.java:426)
		at java.net.http/jdk.internal.net.http.SocketTube.readAvailable(SocketTube.java:1170)
		at java.net.http/jdk.internal.net.http.SocketTube$InternalReadPublisher$InternalReadSubscription.read(SocketTube.java:833)
		at java.net.http/jdk.internal.net.http.SocketTube$SocketFlowTask.run(SocketTube.java:181)
		at java.net.http/jdk.internal.net.http.common.SequentialScheduler$SchedulableTask.run(SequentialScheduler.java:230)
		at java.net.http/jdk.internal.net.http.common.SequentialScheduler.runOrSchedule(SequentialScheduler.java:303)
		at java.net.http/jdk.internal.net.http.common.SequentialScheduler.runOrSchedule(SequentialScheduler.java:256)
		at java.net.http/jdk.internal.net.http.SocketTube$InternalReadPublisher$InternalReadSubscription.signalReadable(SocketTube.java:774)
		at java.net.http/jdk.internal.net.http.SocketTube$InternalReadPublisher$ReadEvent.signalEvent(SocketTube.java:957)
		at java.net.http/jdk.internal.net.http.SocketTube$SocketFlowEvent.handle(SocketTube.java:253)
		at java.net.http/jdk.internal.net.http.HttpClientImpl$SelectorManager.handleEvent(HttpClientImpl.java:984)
		at java.net.http/jdk.internal.net.http.HttpClientImpl$SelectorManager.lambda$run$3(HttpClientImpl.java:939)
		at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
		at java.net.http/jdk.internal.net.http.HttpClientImpl$SelectorManager.run(HttpClientImpl.java:939)
}

