package u10;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2379b;
import g91.C32289b0;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.buttons.Button;
import p366bk.C10322k;
import t10.C28298c;
import ue1.C43064a;

/* renamed from: u10.j */
public final class C28546j extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final ImageView f72466d;

    /* renamed from: e */
    private final Button f72467e;

    /* renamed from: f */
    private C43064a f72468f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28546j(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
        this.f72466d = (ImageView) view.findViewById(C10322k.contact_avatar_image);
        this.f72467e = (Button) view.findViewById(C10322k.change_avatar_button);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m87486j(C28546j jVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        C43064a aVar = jVar.f72468f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: i */
    public final void mo68282i(C28298c cVar) {
        C41536l.m120489i(cVar, "profilePictureItem");
        this.f72466d.setImageDrawable((Drawable) null);
        C2379b.m9210t(this.itemView.getContext()).mo7742m(this.f72466d);
        if (cVar.mo67942c() != null) {
            C32289b0.m95097i(this.f72466d, cVar.mo67942c());
        } else {
            this.f72466d.setImageResource(cVar.mo67940a());
        }
        this.f72467e.setOnClickListener(new C28545i(this));
    }

    /* renamed from: k */
    public final void mo68283k(C43064a aVar) {
        this.f72468f = aVar;
    }
}
