package a11;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.common.Image;
import p642vh.C18338b0;
import p642vh.C18368l;
import ue1.C43075l;
import w01.C39500b;

/* renamed from: a11.b */
public final class C30467b extends RecyclerView.C1736h {

    /* renamed from: d */
    private C18338b0 f76460d = C18338b0.C18346e.f51796d;

    /* renamed from: e */
    private List f76461e = C41341q.m119907j();

    /* renamed from: a11.b$a */
    public final class C30468a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C39500b f76462d;

        /* renamed from: e */
        final /* synthetic */ C30467b f76463e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30468a(C30467b bVar, C39500b bVar2) {
            super(bVar2.mo3946b());
            C41536l.m120489i(bVar2, "binding");
            this.f76463e = bVar;
            this.f76462d = bVar2;
        }

        /* renamed from: h */
        public final void mo70805h(Image image) {
            C41536l.m120489i(image, "image");
            LottieAnimationView lottieAnimationView = this.f76462d.f93952e;
            C41536l.m120488h(lottieAnimationView, "binding.lottieAnim");
            C18368l.m62746A(lottieAnimationView, image, (C43075l) null, 2, (Object) null);
            if (image instanceof Image.Animation) {
                this.f76462d.f93952e.mo7438w();
            }
        }
    }

    /* renamed from: f */
    public void onBindViewHolder(C30468a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        aVar.mo70805h((Image) this.f76461e.get(this.f76460d.mo46117b().mo46119a(this.f76461e.size(), i)));
    }

    /* renamed from: g */
    public C30468a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C39500b d = C39500b.m114825d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C30468a(this, d);
    }

    public int getItemCount() {
        return this.f76460d.mo46117b().mo46120b(this.f76461e.size());
    }

    /* renamed from: h */
    public final void mo70803h(C18338b0 b0Var) {
        C41536l.m120489i(b0Var, "<set-?>");
        this.f76460d = b0Var;
    }

    /* renamed from: i */
    public final void mo70804i(List list) {
        C41536l.m120489i(list, "items");
        this.f76461e = list;
        notifyDataSetChanged();
    }
}
