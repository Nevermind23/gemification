package p341ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.activity;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import g91.C32319m;
import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import z30.C30146d;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.activity.AnalysisFragmentActivity */
public final class AnalysisFragmentActivity extends C30772sa {

    /* renamed from: F */
    public static final C22038a f58644F = new C22038a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: G */
    public static final String f58645G = "CONFIGURATION";
    /* access modifiers changed from: private */

    /* renamed from: H */
    public static final String f58646H = "MONTH";
    /* access modifiers changed from: private */

    /* renamed from: I */
    public static final String f58647I = "TAB_TYPE";

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.activity.AnalysisFragmentActivity$a */
    public static final class C22038a {
        private C22038a() {
        }

        public /* synthetic */ C22038a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo54771a(Context context, C22039b bVar, C30146d.C30148b bVar2, long j) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(bVar, "configuration");
            C41536l.m120489i(bVar2, "tabType");
            Intent intent = new Intent(context, AnalysisFragmentActivity.class);
            intent.putExtra(AnalysisFragmentActivity.f58645G, bVar);
            intent.putExtra(AnalysisFragmentActivity.f58646H, j);
            intent.putExtra(AnalysisFragmentActivity.f58647I, bVar2);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.activity.AnalysisFragmentActivity$b */
    public static abstract class C22039b implements Serializable {

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.activity.AnalysisFragmentActivity$b$a */
        public static final class C22040a extends C22039b {

            /* renamed from: d */
            private final long f58648d;

            public C22040a(long j) {
                super((DefaultConstructorMarker) null);
                this.f58648d = j;
            }

            /* renamed from: a */
            public final long mo54772a() {
                return this.f58648d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C22040a) && this.f58648d == ((C22040a) obj).f58648d;
            }

            public int hashCode() {
                return C7397t.m28148a(this.f58648d);
            }

            public String toString() {
                long j = this.f58648d;
                return "BudgetingPreview(categoryId=" + j + ")";
            }
        }

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.activity.AnalysisFragmentActivity$b$b */
        public static final class C22041b extends C22039b {

            /* renamed from: d */
            public static final C22041b f58649d = new C22041b();

            private C22041b() {
                super((DefaultConstructorMarker) null);
            }
        }

        private C22039b() {
        }

        public /* synthetic */ C22039b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_analysis_fragment;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C30146d dVar;
        super.mo37451O1(bundle);
        Serializable serializableExtra = getIntent().getSerializableExtra(f58645G);
        C41536l.m120487g(serializableExtra, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.activity.AnalysisFragmentActivity.Configuration");
        C22039b bVar = (C22039b) serializableExtra;
        if (C41536l.m120484d(bVar, C22039b.C22041b.f58649d)) {
            long longExtra = getIntent().getLongExtra(f58646H, 0);
            dVar = C30146d.f76007u.mo70512b(new FilterValue.Calendar(longExtra, C32319m.m95315v(Long.valueOf(longExtra)), (Long) null, 0L), (FilterValue.MultiSelect) null, (FilterValue.SingleSelect) null);
        } else if (bVar instanceof C22039b.C22040a) {
            long longExtra2 = getIntent().getLongExtra(f58646H, 0);
            dVar = C30146d.f76007u.mo70512b(new FilterValue.Calendar(longExtra2, C32319m.m95315v(Long.valueOf(longExtra2)), (Long) null, 0L), (FilterValue.MultiSelect) null, new FilterValue.SingleSelect(((C22039b.C22040a) bVar).mo54772a()));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        dVar.mo70510i2(false);
        Serializable serializableExtra2 = getIntent().getSerializableExtra(f58647I);
        C41536l.m120487g(serializableExtra2, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.fragment.AnalysisFragment.TabType");
        dVar.mo70509f2((C30146d.C30148b) serializableExtra2);
        getSupportFragmentManager().mo4428p().mo4631b(C10322k.f28769Me, dVar).mo4515i();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.header_text_statistics);
        C41536l.m120488h(string, "getString(R.string.header_text_statistics)");
        return string;
    }
}
