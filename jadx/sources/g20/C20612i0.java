package g20;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import h20.C24852b;
import j61.C36747a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p086g1.C6201a;
import p341ge.bog.mobilebank.cleanarch.presentation.home.model.StoryGroupThumbnail;
import ue1.C43064a;

/* renamed from: g20.i0 */
public abstract class C20612i0 extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final Handler f55684d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private C43064a f55685e;

    /* renamed from: g20.i0$a */
    static final class C20613a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C24852b f55686d;

        /* renamed from: e */
        final /* synthetic */ StoryGroupThumbnail f55687e;

        /* renamed from: f */
        final /* synthetic */ int f55688f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20613a(C24852b bVar, StoryGroupThumbnail storyGroupThumbnail, int i) {
            super(0);
            this.f55686d = bVar;
            this.f55687e = storyGroupThumbnail;
            this.f55688f = i;
        }

        public final void invoke() {
            this.f55686d.mo48827b(this.f55687e, this.f55688f);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20612i0(C6201a aVar) {
        super(aVar.mo3946b());
        C41536l.m120489i(aVar, "binding");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m66893l(C24852b bVar, StoryGroupThumbnail storyGroupThumbnail, int i, View view) {
        C41536l.m120489i(bVar, "$listener");
        C41536l.m120489i(storyGroupThumbnail, "$item");
        bVar.mo48826a(storyGroupThumbnail, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m66894o(C20612i0 i0Var) {
        C41536l.m120489i(i0Var, "this$0");
        C43064a aVar = i0Var.f55685e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: j */
    public abstract void mo49158j(StoryGroupThumbnail storyGroupThumbnail);

    /* renamed from: k */
    public final void mo49159k(StoryGroupThumbnail storyGroupThumbnail, C24852b bVar, int i) {
        C41536l.m120489i(storyGroupThumbnail, "item");
        C41536l.m120489i(bVar, "listener");
        mo49158j(storyGroupThumbnail);
        this.itemView.setOnClickListener(new C20610h0(bVar, storyGroupThumbnail, i));
        this.f55685e = new C20613a(bVar, storyGroupThumbnail, i);
    }

    /* renamed from: m */
    public final void mo49160m() {
        this.f55684d.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: n */
    public final void mo49161n() {
        this.f55684d.postDelayed(new C20608g0(this), C36747a.f88646a.mo89571a());
    }
}
