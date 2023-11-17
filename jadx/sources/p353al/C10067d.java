package p353al;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.C1796h;
import androidx.recyclerview.widget.C1819o;
import g91.C32343x;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37626z;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.thumbnailbadgecard.ThumbnailBadgeCardView;
import p353al.C10069e;
import p451hk.C15527e;
import p451hk.C15529g;
import p493kk.C16462p;
import p493kk.C16465s;
import p493kk.C16466t;
import p493kk.C16467u;
import p700zk.C19040b;

/* renamed from: al.d */
public final class C10067d extends C1819o {

    /* renamed from: f */
    private final C19040b f27834f;

    /* renamed from: g */
    private int f27835g = -1;

    /* renamed from: al.d$a */
    public static final class C10068a extends C1796h.C1802f {

        /* renamed from: a */
        public static final C10068a f27836a = new C10068a();

        private C10068a() {
        }

        /* renamed from: d */
        public boolean mo5976a(C10069e eVar, C10069e eVar2) {
            C41536l.m120489i(eVar, "oldItem");
            C41536l.m120489i(eVar2, "newItem");
            if (!(eVar instanceof C10069e.C10071b) || !(eVar2 instanceof C10069e.C10071b)) {
                return C41536l.m120484d(eVar, eVar2);
            }
            return Arrays.equals(((C10069e.C10071b) eVar).mo26519a().toArray(new String[0]), ((C10069e.C10071b) eVar2).mo26519a().toArray(new String[0]));
        }

        /* renamed from: e */
        public boolean mo5977b(C10069e eVar, C10069e eVar2) {
            C41536l.m120489i(eVar, "oldItem");
            C41536l.m120489i(eVar2, "newItem");
            if (!(eVar instanceof C10069e.C10071b) || !(eVar2 instanceof C10069e.C10071b)) {
                return C41536l.m120484d(eVar, eVar2);
            }
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10067d(C19040b bVar) {
        super(C10068a.f27836a);
        C41536l.m120489i(bVar, "input");
        this.f27834f = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m36919o(C10067d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.f27834f.mo37586J3();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final void m36920p(C10067d dVar, Chip chip, int i) {
        C41536l.m120489i(dVar, "this$0");
        C41536l.m120489i(chip, "chip");
        dVar.mo26516s(i);
        dVar.f27834f.mo37593y(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m36921q(C10067d dVar, C37626z zVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        C41536l.m120489i(zVar, "$holder");
        dVar.f27834f.mo37589Ou(zVar.getBindingAdapterPosition() - 1);
    }

    public int getItemViewType(int i) {
        C10069e eVar = (C10069e) mo6027g(i);
        if (eVar instanceof C10069e.C10071b) {
            return C15527e.item_insurance_provider_list_header;
        }
        if (eVar instanceof C10069e.C10073d) {
            return C15527e.item_car_liability_insurance_provider;
        }
        if (eVar instanceof C10069e.C10072c) {
            return C15527e.item_skeleton_providers;
        }
        if (eVar instanceof C10069e.C10070a) {
            return C15527e.item_providers_load_error;
        }
        throw new IllegalStateException(("Unknown viewType for item: " + eVar).toString());
    }

    /* renamed from: n */
    public void onBindViewHolder(C37626z zVar, int i) {
        String str;
        String str2;
        boolean z;
        C37626z zVar2 = zVar;
        C41536l.m120489i(zVar2, "holder");
        Context context = zVar2.itemView.getContext();
        C10069e eVar = (C10069e) mo6027g(i);
        if (eVar instanceof C10069e.C10071b) {
            C6201a h = zVar.mo90806h();
            C41536l.m120487g(h, "null cannot be cast to non-null type ge.bog.mobilebank.autoliabilityinsurance.databinding.ItemInsuranceProviderListHeaderBinding");
            C16465s sVar = (C16465s) h;
            Group group = sVar.f46609f;
            C41536l.m120488h(group, "ccyGroup");
            C10069e.C10071b bVar = (C10069e.C10071b) eVar;
            C32343x.m95483r1(group, !bVar.mo26519a().isEmpty(), false, 2, (Object) null);
            sVar.f46608e.mo35190t();
            int i2 = 0;
            for (String chipTitle : bVar.mo26519a()) {
                int i3 = i2 + 1;
                ChipGroup chipGroup = sVar.f46608e;
                C41536l.m120488h(context, "context");
                Chip chip = r3;
                Chip chip2 = new Chip(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                chip.setChipTitle(chipTitle);
                if (this.f27835g == i2) {
                    z = true;
                } else {
                    z = false;
                }
                chip.setActivated(z);
                chipGroup.mo35183o(chip);
                i2 = i3;
            }
            sVar.f46608e.setOnChipActivatedChangedListener(new C10064a(this));
        } else if (eVar instanceof C10069e.C10073d) {
            C6201a h2 = zVar.mo90806h();
            C41536l.m120487g(h2, "null cannot be cast to non-null type ge.bog.mobilebank.autoliabilityinsurance.databinding.ItemCarLiabilityInsuranceProviderBinding");
            C16462p pVar = (C16462p) h2;
            pVar.mo3946b().setOnClickListener(new C10065b(this, zVar2));
            ThumbnailBadgeCardView c = pVar.mo3946b();
            C10069e.C10073d dVar = (C10069e.C10073d) eVar;
            String a = dVar.mo26523a();
            if (a == null) {
                str = "";
            } else {
                str = a;
            }
            Image.Url url = new Image.Url(str, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
            String d = dVar.mo26526d();
            if (d == null) {
                str2 = "";
            } else {
                str2 = d;
            }
            c.setValue(new ThumbnailBadgeCardView.C13547d(url, str2, new ThumbnailBadgeCardView.C13544a(dVar.mo26525c(), C40440x.m117148Q0(" " + context.getString(C15529g.provider_list_item_label_suffix_from_per_month)).toString(), C40440x.m117150R0(context.getString(C15529g.provider_list_item_label_prefix_from_per_month) + " ").toString()), context.getString(C15529g.provider_list_item_label_indemnification_limits), dVar.mo26524b(), (List) null, (List) null, 96, (DefaultConstructorMarker) null));
        } else if (!(eVar instanceof C10069e.C10072c) && (eVar instanceof C10069e.C10070a)) {
            C6201a h3 = zVar.mo90806h();
            C41536l.m120487g(h3, "null cannot be cast to non-null type ge.bog.mobilebank.autoliabilityinsurance.databinding.ItemProvidersLoadErrorBinding");
            ((C16466t) h3).f46614f.setOnClickListener(new C10066c(this));
        }
    }

    /* renamed from: r */
    public C37626z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C15527e.item_insurance_provider_list_header) {
            C16465s d = C16465s.m58666d(from, viewGroup, false);
            d.f46611h.setTitle(C32343x.m95388F("rbc.insurance.choose.policy", new Object[0]));
            d.f46611h.setText(C32343x.m95388F("rbc.insurance.choose.provider.and.limit", new Object[0]));
            return new C37626z(d);
        } else if (i == C15527e.item_car_liability_insurance_provider) {
            return new C37626z(C16462p.m58654d(from, viewGroup, false));
        } else {
            if (i == C15527e.item_skeleton_providers) {
                return new C37626z(C16467u.m58674d(from, viewGroup, false));
            }
            if (i == C15527e.item_providers_load_error) {
                C16466t d2 = C16466t.m58670d(from, viewGroup, false);
                d2.f46613e.setText(C32343x.m95388F("rbc.insurance.policy.load.error", new Object[0]));
                return new C37626z(d2);
            }
            throw new IllegalStateException(("Unknown viewType: " + i).toString());
        }
    }

    /* renamed from: s */
    public final void mo26516s(int i) {
        if (i != this.f27835g) {
            this.f27835g = i;
            notifyItemChanged(0);
        }
    }
}
