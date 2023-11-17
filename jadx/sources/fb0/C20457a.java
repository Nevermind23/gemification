package fb0;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.res.C0808h;
import androidx.recyclerview.widget.RecyclerView;
import da0.C19950d;
import da0.C19954h;
import g91.C32289b0;
import g91.C32343x;
import ha0.C24946w;
import ha0.C24949z;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.imageselector.ImageSelectorView;
import p341ge.bog.mobilebank.depositapplication.presentation.application.model.DepositPurposeUiModel;
import p642vh.C18338b0;

/* renamed from: fb0.a */
public final class C20457a extends RecyclerView.C1736h {

    /* renamed from: d */
    private C18338b0 f55452d = C18338b0.C18346e.f51796d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C20458a f55453e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f55454f;

    /* renamed from: g */
    private List f55455g = C41341q.m119907j();

    /* renamed from: fb0.a$a */
    public interface C20458a {
        /* renamed from: a */
        void mo48603a(long j);
    }

    /* renamed from: fb0.a$b */
    public final class C20459b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24946w f55456d;

        /* renamed from: e */
        final /* synthetic */ C20457a f55457e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20459b(C20457a aVar, C24946w wVar) {
            super(wVar.mo3946b());
            C41536l.m120489i(wVar, "binding");
            this.f55457e = aVar;
            this.f55456d = wVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m66656j(DepositPurposeUiModel depositPurposeUiModel, C20457a aVar, View view) {
            C20458a f;
            C41536l.m120489i(aVar, "this$0");
            if (depositPurposeUiModel != null && (f = aVar.f55453e) != null) {
                f.mo48603a(depositPurposeUiModel.mo56801d());
            }
        }

        /* renamed from: k */
        private final void m66657k(ImageSelectorView imageSelectorView, String str) {
            boolean z;
            if (str == null || C40439w.m117118v(str)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                imageSelectorView.setImageUrl(C32289b0.m95091c(str));
            } else {
                imageSelectorView.setImageDrawable(C0808h.m3031f(this.itemView.getResources(), C19950d.f54502w, (Resources.Theme) null));
            }
        }

        /* renamed from: l */
        private final void m66658l(View view, boolean z) {
            if (z) {
                C32343x.m95447f1(view);
            } else {
                C32343x.m95405N0(view);
            }
        }

        /* renamed from: i */
        public final void mo48989i(List list) {
            String str;
            String str2;
            boolean z;
            String a;
            C41536l.m120489i(list, "purposes");
            int childCount = this.f55456d.mo3946b().getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f55456d.mo3946b().getChildAt(i);
                if (C41536l.m120484d(childAt.getTag(), this.itemView.getContext().getString(C19954h.deposit_purpose_tag))) {
                    DepositPurposeUiModel depositPurposeUiModel = (DepositPurposeUiModel) C41358y.m120010Z(list, i);
                    C24949z a2 = C24949z.m79776a(childAt);
                    C41536l.m120488h(a2, "bind(child)");
                    ImageSelectorView imageSelectorView = a2.f64268f;
                    C41536l.m120488h(imageSelectorView, "purposeBinding.imageSelector");
                    String str3 = null;
                    if (depositPurposeUiModel != null) {
                        str = depositPurposeUiModel.mo56800b();
                    } else {
                        str = null;
                    }
                    m66657k(imageSelectorView, str);
                    ImageSelectorView imageSelectorView2 = a2.f64268f;
                    if (depositPurposeUiModel != null) {
                        str2 = depositPurposeUiModel.mo56803e();
                    } else {
                        str2 = null;
                    }
                    Object g = this.f55457e.f55454f;
                    if (g == null) {
                        g = Boolean.FALSE;
                    }
                    imageSelectorView2.setChecked(C41536l.m120484d(str2, g));
                    TextView textView = a2.f64269g;
                    if (!(depositPurposeUiModel == null || (a = depositPurposeUiModel.mo56799a()) == null)) {
                        str3 = C32343x.m95388F(a, new Object[0]);
                    }
                    textView.setText(str3);
                    a2.f64267e.setOnClickListener(new C20460b(depositPurposeUiModel, this.f55457e));
                    FrameLayout c = a2.mo3946b();
                    C41536l.m120488h(c, "purposeBinding.root");
                    if (depositPurposeUiModel != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m66658l(c, z);
                }
            }
        }
    }

    public int getItemCount() {
        return this.f55455g.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040 A[LOOP:0: B:1:0x0008->B:15:0x0040, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo48982h() {
        /*
            r6 = this;
            java.util.List r0 = r6.f55455g
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L_0x0008:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0043
            java.lang.Object r3 = r0.next()
            java.util.List r3 = (java.util.List) r3
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L_0x0020
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0020
        L_0x001e:
            r3 = r1
            goto L_0x003d
        L_0x0020:
            java.util.Iterator r3 = r3.iterator()
        L_0x0024:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x001e
            java.lang.Object r4 = r3.next()
            ge.bog.mobilebank.depositapplication.presentation.application.model.DepositPurposeUiModel r4 = (p341ge.bog.mobilebank.depositapplication.presentation.application.model.DepositPurposeUiModel) r4
            java.lang.String r4 = r4.mo56803e()
            java.lang.String r5 = r6.f55454f
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r4 == 0) goto L_0x0024
            r3 = 1
        L_0x003d:
            if (r3 == 0) goto L_0x0040
            goto L_0x0044
        L_0x0040:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x0043:
            r2 = -1
        L_0x0044:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: fb0.C20457a.mo48982h():int");
    }

    /* renamed from: i */
    public void onBindViewHolder(C20459b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        bVar.mo48989i((List) this.f55455g.get(this.f55452d.mo46117b().mo46119a(this.f55455g.size(), i)));
    }

    /* renamed from: j */
    public C20459b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C24946w d = C24946w.m79765d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C20459b(this, d);
    }

    /* renamed from: k */
    public final void mo48985k(String str) {
        this.f55454f = str;
        notifyDataSetChanged();
    }

    /* renamed from: l */
    public final void mo48986l(C20458a aVar) {
        this.f55453e = aVar;
    }

    /* renamed from: m */
    public final void mo48987m(C18338b0 b0Var) {
        C41536l.m120489i(b0Var, "<set-?>");
        this.f55452d = b0Var;
    }

    /* renamed from: n */
    public final void mo48988n(List list) {
        C41536l.m120489i(list, "list");
        this.f55455g = list;
        notifyDataSetChanged();
    }
}
