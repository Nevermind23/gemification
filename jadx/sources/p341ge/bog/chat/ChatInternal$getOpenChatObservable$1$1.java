package p341ge.bog.chat;

import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1606m;
import androidx.lifecycle.C1619q;
import hd1.C41205b;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.chat.ChatInternal$getOpenChatObservable$1$1 */
public final class ChatInternal$getOpenChatObservable$1$1 implements C1606m {

    /* renamed from: d */
    final /* synthetic */ C41205b f38308d;

    ChatInternal$getOpenChatObservable$1$1(C41205b bVar) {
        this.f38308d = bVar;
    }

    /* renamed from: b */
    public void mo336b(C1619q qVar, C1593j.C1594a aVar) {
        C41536l.m120489i(qVar, "source");
        C41536l.m120489i(aVar, "event");
        if (aVar == C1593j.C1594a.ON_DESTROY) {
            this.f38308d.dispose();
        }
    }
}
