package p341ge.bog.chat.presentation.activity;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import p653wf.C18586o;

/* renamed from: ge.bog.chat.presentation.activity.h0 */
public final class C13029h0 extends RecyclerView.C1746o {

    /* renamed from: a */
    private final int f38398a;

    /* renamed from: b */
    private final int f38399b;

    /* renamed from: c */
    private final int f38400c;

    /* renamed from: ge.bog.chat.presentation.activity.h0$a */
    public /* synthetic */ class C13030a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38401a;

        static {
            int[] iArr = new int[C13027g0.values().length];
            iArr[C13027g0.FIRST_MESSAGE.ordinal()] = 1;
            iArr[C13027g0.NO_GROUP.ordinal()] = 2;
            iArr[C13027g0.MIDDLE_MESSAGE.ordinal()] = 3;
            iArr[C13027g0.LAST_MESSAGE.ordinal()] = 4;
            f38401a = iArr;
        }
    }

    public C13029h0(Context context) {
        C41536l.m120489i(context, "context");
        this.f38398a = context.getResources().getDimensionPixelSize(C18586o.chat_message_padding_horizontal);
        this.f38399b = context.getResources().getDimensionPixelSize(C18586o.chat_message_padding_vertical_big);
        this.f38400c = context.getResources().getDimensionPixelSize(C18586o.chat_message_padding_vertical_small);
    }

    /* renamed from: e */
    public void mo5615e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
        C13027g0 g0Var;
        C41536l.m120489i(rect, "outRect");
        C41536l.m120489i(view, "view");
        C41536l.m120489i(recyclerView, "parent");
        C41536l.m120489i(b0Var, "state");
        int k0 = recyclerView.mo5355k0(view);
        int i = -1;
        if (k0 != -1) {
            RecyclerView.C1736h adapter = recyclerView.getAdapter();
            if (adapter instanceof C13039l0) {
                C13034j0 m = ((C13039l0) adapter).mo34313m(k0);
                if (m != null) {
                    g0Var = m.mo34298m();
                } else {
                    g0Var = null;
                }
                if (g0Var != null) {
                    i = C13030a.f38401a[g0Var.ordinal()];
                }
                if (i == 1) {
                    int i2 = this.f38398a;
                    rect.set(i2, this.f38399b, i2, this.f38400c);
                } else if (i == 2) {
                    int i3 = this.f38398a;
                    int i4 = this.f38399b;
                    rect.set(i3, i4, i3, i4);
                } else if (i == 3) {
                    int i5 = this.f38398a;
                    int i6 = this.f38400c;
                    rect.set(i5, i6, i5, i6);
                } else if (i == 4) {
                    int i7 = this.f38398a;
                    rect.set(i7, this.f38400c, i7, this.f38399b);
                }
            }
        }
    }
}
