package p407ei;

import af1.C40303i;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import p341ge.bog.designsystem.components.common.Image;
import p352ak.C9963m;
import p642vh.C18375n;

/* renamed from: ei.c */
public final class C12474c extends RecyclerView.C1736h {

    /* renamed from: d */
    private List f37137d = C41341q.m119907j();

    /* renamed from: ei.c$a */
    public final class C12475a extends RecyclerView.C1734f0 {

        /* renamed from: g */
        static final /* synthetic */ C40303i[] f37138g = {C41520a0.m120439e(new C41539o(C12475a.class, "image", "getImage()Lge/bog/designsystem/components/common/Image;", 0))};

        /* renamed from: d */
        private final C9963m f37139d;

        /* renamed from: e */
        private final C18375n f37140e;

        /* renamed from: f */
        final /* synthetic */ C12474c f37141f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12475a(C12474c cVar, C9963m mVar) {
            super(mVar.mo3946b());
            C41536l.m120489i(mVar, "binding");
            this.f37141f = cVar;
            this.f37139d = mVar;
            AppCompatImageView appCompatImageView = mVar.f27259e;
            C41536l.m120488h(appCompatImageView, "binding.image");
            this.f37140e = new C18375n(appCompatImageView);
        }

        /* renamed from: h */
        public final void mo33088h(Image image) {
            C41536l.m120489i(image, "image");
            mo33089i(image);
        }

        /* renamed from: i */
        public final void mo33089i(Image image) {
            this.f37140e.setValue(this, f37138g[0], image);
        }
    }

    /* renamed from: f */
    public void onBindViewHolder(C12475a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        aVar.mo33088h((Image) this.f37137d.get(i % this.f37137d.size()));
    }

    /* renamed from: g */
    public C12475a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C9963m d = C9963m.m36543d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        return new C12475a(this, d);
    }

    public int getItemCount() {
        return this.f37137d.isEmpty() ? 0 : Integer.MAX_VALUE;
    }

    /* renamed from: h */
    public final void mo33087h(List list) {
        C41536l.m120489i(list, "images");
        this.f37137d = list;
        notifyDataSetChanged();
    }
}
