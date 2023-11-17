package l61;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import c61.C31279d;
import d20.C19877n;
import g20.C20612i0;
import h20.C24852b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.storythumbnail.StoryThumbnail;
import p341ge.bog.designsystem.components.storythumbnail.model.StoryThumbnailData;
import p341ge.bog.mobilebank.cleanarch.presentation.home.model.StoryGroupThumbnail;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;

/* renamed from: l61.i */
public final class C37089i extends C19877n {

    /* renamed from: f */
    private final C24852b f89267f;

    /* renamed from: l61.i$a */
    public static final class C37090a extends C20612i0 {

        /* renamed from: f */
        private final C31279d f89268f;

        /* renamed from: g */
        private final Handler f89269g = new Handler(Looper.getMainLooper());

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37090a(C31279d dVar) {
            super(dVar);
            C41536l.m120489i(dVar, "binding");
            this.f89268f = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public static final void m109640q(C37090a aVar, StoryGroupThumbnail storyGroupThumbnail) {
            StoryThumbnail c = aVar.f89268f.mo3946b();
            StringSource e = storyGroupThumbnail.mo54191e();
            String str = null;
            if (e != null) {
                str = C34646b.m101752f(e, (Context) null, 1, (Object) null);
            }
            c.setData(new StoryThumbnailData(str, storyGroupThumbnail.mo54189d(), storyGroupThumbnail.mo54193f(), (Image) null, (Color) null, 24, (DefaultConstructorMarker) null));
        }

        /* renamed from: j */
        public void mo49158j(StoryGroupThumbnail storyGroupThumbnail) {
            C41536l.m120489i(storyGroupThumbnail, "item");
            this.f89269g.removeCallbacksAndMessages((Object) null);
            if (storyGroupThumbnail.mo54189d() instanceof Image.Animation) {
                this.f89269g.postDelayed(new C37088h(this, storyGroupThumbnail), 200);
            } else {
                m109640q(this, storyGroupThumbnail);
            }
        }
    }

    public C37089i(C24852b bVar) {
        C41536l.m120489i(bVar, "listener");
        this.f89267f = bVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C20612i0 i0Var, int i) {
        C41536l.m120489i(i0Var, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        i0Var.mo49159k((StoryGroupThumbnail) g, this.f89267f, i);
    }

    /* renamed from: l */
    public C20612i0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C31279d d = C31279d.m92907d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C37090a(d);
    }

    /* renamed from: m */
    public void onViewAttachedToWindow(C20612i0 i0Var) {
        C41536l.m120489i(i0Var, "holder");
        super.onViewAttachedToWindow(i0Var);
        i0Var.mo49161n();
    }

    /* renamed from: n */
    public void onViewDetachedFromWindow(C20612i0 i0Var) {
        C41536l.m120489i(i0Var, "holder");
        super.onViewDetachedFromWindow(i0Var);
        i0Var.mo49160m();
    }
}
