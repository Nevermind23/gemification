package p341ge.bog.mobilebank.cleanarch.becomesolo.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloApplicationActivity;
import p341ge.bog.mobilebank.cleanarch.productdescription.presentation.activity.ProductDescriptionActivity;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p366bk.C10328q;
import p867qq.C27852a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloDescriptionActivity */
public final class BecomeSoloDescriptionActivity extends ProductDescriptionActivity {

    /* renamed from: I */
    public static final C20838b f56100I = new C20838b((DefaultConstructorMarker) null);

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloDescriptionActivity$a */
    public enum C20837a {
        BANNER_CLICK,
        MORE_MENU,
        DYNAMIC_LINK,
        PUSH
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloDescriptionActivity$b */
    public static final class C20838b {
        private C20838b() {
        }

        public /* synthetic */ C20838b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo49590a(C35388f2 f2Var, C20837a aVar) {
            C41536l.m120489i(f2Var, "activity");
            C41536l.m120489i(aVar, "source");
            Intent intent = new Intent(f2Var, BecomeSoloDescriptionActivity.class);
            intent.putExtra("EXTRA_START_SOURCE", aVar);
            f2Var.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloDescriptionActivity$c */
    public /* synthetic */ class C20839c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56106a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloDescriptionActivity$a[] r0 = p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloDescriptionActivity.C20837a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloDescriptionActivity$a r1 = p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloDescriptionActivity.C20837a.BANNER_CLICK     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloDescriptionActivity$a r1 = p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloDescriptionActivity.C20837a.MORE_MENU     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f56106a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloDescriptionActivity.C20839c.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloDescriptionActivity$d */
    static final class C20840d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BecomeSoloDescriptionActivity f56107d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20840d(BecomeSoloDescriptionActivity becomeSoloDescriptionActivity) {
            super(1);
            this.f56107d = becomeSoloDescriptionActivity;
        }

        /* renamed from: a */
        public final void mo49591a(View view) {
            C41536l.m120489i(view, "it");
            BecomeSoloApplicationActivity.C20819a aVar = BecomeSoloApplicationActivity.f56085J;
            BecomeSoloDescriptionActivity becomeSoloDescriptionActivity = this.f56107d;
            aVar.mo49572a(becomeSoloDescriptionActivity, becomeSoloDescriptionActivity.mo55529L2().mo55561kw(), this.f56107d.mo55529L2().mo55560jw());
            BecomeSoloDescriptionActivity becomeSoloDescriptionActivity2 = this.f56107d;
            Intent intent = becomeSoloDescriptionActivity2.getIntent();
            if (intent != null) {
                becomeSoloDescriptionActivity2.m67426X2(intent);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49591a((View) obj);
            return C41238w.f97225a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public final void m67426X2(Intent intent) {
        String str;
        C20837a aVar = (C20837a) intent.getSerializableExtra("EXTRA_START_SOURCE");
        if (aVar != null) {
            if (C20839c.f56106a[aVar.ordinal()] != 1) {
                str = "become_solo_appl_open_application_details;";
            } else {
                str = "become_solo_banner_open_application_details;";
            }
            C27852a.m86058a(str);
        }
    }

    /* renamed from: K2 */
    public String mo49588K2() {
        return "OFFERS_BECOME_SOLO_TERMS";
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        ProductDescriptionActivity.m72913P2(this, (String) null, new C20840d(this), 1, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 52052) {
            return;
        }
        if (i2 == -1) {
            finish();
        } else if (i2 == 0) {
            C27852a.m86058a("become_solo_appl_close_details_without_sending;");
        }
    }

    public void onBackPressed() {
        C27852a.m86058a("become_solo_close_terms_page;");
        super.onBackPressed();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C41536l.m120489i(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return false;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.header_text_solo);
        C41536l.m120488h(string, "getString(R.string.header_text_solo)");
        return string;
    }
}
