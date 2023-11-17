package p341ge.bog.mobilebank.categorypackages.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.C0173b;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import he1.C41217g;
import he1.C41238w;
import java.io.Serializable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p202p0.C7594s;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType;
import p356ao.C10114f;
import p356ao.C10116h;
import p413eo.C12746h;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.CategoryPackagesActivity */
public final class CategoryPackagesActivity extends C14399a {

    /* renamed from: H */
    public static final C14397a f42161H = new C14397a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f42162G = C41219i.m119470b(new C14398b(this));

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.CategoryPackagesActivity$a */
    public static final class C14397a {
        private C14397a() {
        }

        public /* synthetic */ C14397a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo40562a(Context context, PackageType packageType, boolean z, String str, C0173b bVar) {
            C41238w wVar;
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, CategoryPackagesActivity.class);
            intent.putExtra("package_type", packageType);
            intent.putExtra("scrollToPackage", str);
            intent.putExtra("forceSoloColor", z);
            if (bVar != null) {
                bVar.mo404a(intent);
                wVar = C41238w.f97225a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                context.startActivity(intent);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.CategoryPackagesActivity$b */
    static final class C14398b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CategoryPackagesActivity f42163d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14398b(CategoryPackagesActivity categoryPackagesActivity) {
            super(0);
            this.f42163d = categoryPackagesActivity;
        }

        /* renamed from: b */
        public final C12746h invoke() {
            return C12746h.m48378d(this.f42163d.getLayoutInflater());
        }
    }

    /* renamed from: E2 */
    private final C12746h m53336E2() {
        return (C12746h) this.f42162G.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        Serializable serializable;
        boolean z;
        int i;
        setContentView((View) m53336E2().mo3946b());
        super.mo37451O1(bundle);
        Fragment j0 = getSupportFragmentManager().mo4415j0(C10114f.f27924C0);
        C41536l.m120487g(j0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        NavHostFragment navHostFragment = (NavHostFragment) j0;
        Intent intent = getIntent();
        if (intent != null) {
            serializable = intent.getSerializableExtra("package_type");
        } else {
            serializable = null;
        }
        if (serializable != null) {
            z = true;
        } else {
            z = false;
        }
        C7594s b = navHostFragment.mo5009k1().mo22114F().mo22243b(C10116h.category_nav_graph);
        if (z) {
            i = C10114f.packageDetailsFragment;
        } else {
            i = C10114f.packagesListFragment;
        }
        b.mo22234T(i);
        navHostFragment.mo5009k1().mo22133k0(b, getIntent().getExtras());
    }

    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
