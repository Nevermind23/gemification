package u30;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10313b;
import p366bk.C10322k;
import p366bk.C10324m;
import r30.C27906g;

/* renamed from: u30.c */
public final class C28553c extends C28575u {

    /* renamed from: h */
    public static final C28554a f72479h = new C28554a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private final View f72480f;

    /* renamed from: g */
    private final Animation f72481g;

    /* renamed from: u30.c$a */
    public static final class C28554a {
        private C28554a() {
        }

        public /* synthetic */ C28554a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C28553c mo68293a(ViewGroup viewGroup) {
            C41536l.m120489i(viewGroup, "parent");
            return new C28553c(C32343x.m95473o0(viewGroup, C10324m.item_contact_loading, false, 2, (Object) null));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28553c(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
        this.f72480f = view.findViewById(C10322k.loader_content);
        this.f72481g = AnimationUtils.loadAnimation(view.getContext(), C10313b.infinite_alpha);
    }

    /* renamed from: j */
    public void onBind(C27906g gVar) {
        C41536l.m120489i(gVar, "item");
        this.f72480f.startAnimation(this.f72481g);
    }
}
