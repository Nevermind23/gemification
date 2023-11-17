package p341ge.bog.designsystem.components.input;

import android.content.ClipboardManager;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.input.a */
final class C13352a extends C41537m implements C43064a {

    /* renamed from: d */
    final /* synthetic */ BogEditText f39663d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C13352a(BogEditText bogEditText) {
        super(0);
        this.f39663d = bogEditText;
    }

    /* renamed from: b */
    public final ClipboardManager invoke() {
        Object systemService = this.f39663d.getContext().getSystemService("clipboard");
        C41536l.m120487g(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        return (ClipboardManager) systemService;
    }
}
