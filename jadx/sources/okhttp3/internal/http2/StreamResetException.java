package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.jvm.internal.C41536l;
import wf1.C43194a;

public final class StreamResetException extends IOException {

    /* renamed from: d */
    public final C43194a f98691d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StreamResetException(C43194a aVar) {
        super(C41536l.m120497q("stream was reset: ", aVar));
        C41536l.m120489i(aVar, "errorCode");
        this.f98691d = aVar;
    }
}
