package fo0;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32289b0;
import g91.C32343x;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37599g;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.imagecard.MediumTextImageCardView;
import p341ge.bog.mobilebank.lifestyleoffers.domain.model.LifestyleChooserInterestType;
import xn0.C18858p;

/* renamed from: fo0.d */
public final class C12941d extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C12943b f38205f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C12945d f38206g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C12944c f38207h;

    /* renamed from: fo0.d$a */
    public final class C12942a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C18858p f38208d;

        /* renamed from: e */
        final /* synthetic */ C12941d f38209e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12942a(C12941d dVar, C18858p pVar) {
            super(pVar.mo3946b());
            C41536l.m120489i(pVar, "binding");
            this.f38209e = dVar;
            this.f38208d = pVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m48875l(C12941d dVar, String str, View view) {
            C41536l.m120489i(dVar, "this$0");
            C41536l.m120489i(str, "$interestType");
            C12943b k = dVar.f38205f;
            if (k != null) {
                k.mo33445a(str);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public static final void m48876m(C12941d dVar, String str) {
            C41536l.m120489i(dVar, "this$0");
            C41536l.m120489i(str, "$interestType");
            C12944c l = dVar.f38207h;
            if (l != null) {
                l.mo33447a(str);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public static final void m48877n(C12941d dVar, String str) {
            C41536l.m120489i(dVar, "this$0");
            C41536l.m120489i(str, "$interestType");
            C12945d m = dVar.f38206g;
            if (m != null) {
                m.mo33446a(str);
            }
        }

        /* renamed from: k */
        public final void mo33716k(LifestyleChooserInterestType lifestyleChooserInterestType) {
            C41536l.m120489i(lifestyleChooserInterestType, "item");
            String interestType = lifestyleChooserInterestType.getInterestType();
            MediumTextImageCardView c = this.f38208d.mo3946b();
            C12941d dVar = this.f38209e;
            C41536l.m120488h(c, "bindData$lambda$3");
            MediumTextImageCardView.m50221l(c, lifestyleChooserInterestType.getTypeDesc(), lifestyleChooserInterestType.getSubtypesDescriptions(), false, false, 12, (Object) null);
            if (lifestyleChooserInterestType.isChosen()) {
                MediumTextImageCardView.m50218g(c, C32343x.m95388F("life.style.chooser.main.page.selected.categories", new Object[0]), lifestyleChooserInterestType.getSubtypesDescriptions(), false, 4, (Object) null);
            } else {
                c.mo35817h();
            }
            String c2 = C32289b0.m95091c(lifestyleChooserInterestType.getInterestTypeImageUrl());
            C41536l.m120488h(c2, "generateImageUrl(item.interestTypeImageUrl)");
            c.setImage(new Image.Url(c2, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null));
            c.setEnabled(lifestyleChooserInterestType.isEnabled());
            c.setOnClickListener(new C12938a(dVar, interestType));
            c.setOnCancelButtonClickListener(new C12939b(dVar, interestType));
            c.setOnEditButtonClickListener(new C12940c(dVar, interestType));
        }
    }

    /* renamed from: fo0.d$b */
    public interface C12943b {
        /* renamed from: a */
        void mo33445a(String str);
    }

    /* renamed from: fo0.d$c */
    public interface C12944c {
        /* renamed from: a */
        void mo33447a(String str);
    }

    /* renamed from: fo0.d$d */
    public interface C12945d {
        /* renamed from: a */
        void mo33446a(String str);
    }

    public C12941d() {
        super(C37599g.f90345a.mo90787d());
    }

    /* renamed from: n */
    public final void mo33713n(C12943b bVar) {
        this.f38205f = bVar;
    }

    /* renamed from: o */
    public final void mo33714o(C12944c cVar) {
        this.f38207h = cVar;
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        LifestyleChooserInterestType lifestyleChooserInterestType;
        C41536l.m120489i(f0Var, "holder");
        if (f0Var instanceof C12942a) {
            Object g = mo6027g(i);
            if (g instanceof LifestyleChooserInterestType) {
                lifestyleChooserInterestType = (LifestyleChooserInterestType) g;
            } else {
                lifestyleChooserInterestType = null;
            }
            if (lifestyleChooserInterestType != null) {
                ((C12942a) f0Var).mo33716k(lifestyleChooserInterestType);
            }
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C18858p d = C18858p.m63803d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(inflater, parent, false)");
        return new C12942a(this, d);
    }

    /* renamed from: p */
    public final void mo33715p(C12945d dVar) {
        this.f38206g = dVar;
    }
}
