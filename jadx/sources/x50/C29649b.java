package x50;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import he1.C41217g;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p349ah.C9860d;
import p366bk.C10328q;
import p90.C27267c3;
import ue1.C43064a;

/* renamed from: x50.b */
public final class C29649b extends C9860d {

    /* renamed from: G */
    public static final C29650a f74819G = new C29650a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private final C41217g f74820B = C41219i.m119470b(new C29654e(this));

    /* renamed from: C */
    private final C41217g f74821C = C41219i.m119470b(new C29653d(this));

    /* renamed from: D */
    private final C41217g f74822D = C41219i.m119470b(new C29652c(this));

    /* renamed from: E */
    private C29651b f74823E;

    /* renamed from: F */
    private C27267c3 f74824F;

    /* renamed from: x50.b$a */
    public static final class C29650a {
        private C29650a() {
        }

        public /* synthetic */ C29650a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C29649b m89985b(C29650a aVar, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = C10328q.trusted_contacts;
            }
            if ((i4 & 2) != 0) {
                i2 = C10328q.due_to_new_regulations_security_description_retail;
            }
            if ((i4 & 4) != 0) {
                i3 = C10328q.contacts_verification;
            }
            return aVar.mo69571a(i, i2, i3);
        }

        /* renamed from: a */
        public final C29649b mo69571a(int i, int i2, int i3) {
            C29649b bVar = new C29649b();
            Bundle bundle = new Bundle();
            bundle.putInt("TITLE_RES_ID", i);
            bundle.putInt("SUBTITLE_RES_ID", i2);
            bundle.putInt("BUTTON_TEXT_RES_ID", i3);
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    /* renamed from: x50.b$b */
    public interface C29651b {
        /* renamed from: t0 */
        void mo53866t0();
    }

    /* renamed from: x50.b$c */
    static final class C29652c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C29649b f74825d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29652c(C29649b bVar) {
            super(0);
            this.f74825d = bVar;
        }

        /* renamed from: b */
        public final Integer invoke() {
            Bundle arguments = this.f74825d.getArguments();
            return Integer.valueOf(arguments != null ? arguments.getInt("BUTTON_TEXT_RES_ID") : C10328q.contacts_verification);
        }
    }

    /* renamed from: x50.b$d */
    static final class C29653d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C29649b f74826d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29653d(C29649b bVar) {
            super(0);
            this.f74826d = bVar;
        }

        /* renamed from: b */
        public final Integer invoke() {
            int i;
            Bundle arguments = this.f74826d.getArguments();
            if (arguments != null) {
                i = arguments.getInt("SUBTITLE_RES_ID");
            } else if (C36546y.m108285N().mo89313K().getUserInfo().isSolo()) {
                i = C10328q.due_to_new_regulations_security_description_solo;
            } else {
                i = C10328q.due_to_new_regulations_security_description_retail;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: x50.b$e */
    static final class C29654e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C29649b f74827d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29654e(C29649b bVar) {
            super(0);
            this.f74827d = bVar;
        }

        /* renamed from: b */
        public final Integer invoke() {
            Bundle arguments = this.f74827d.getArguments();
            return Integer.valueOf(arguments != null ? arguments.getInt("TITLE_RES_ID") : C10328q.trusted_contacts);
        }
    }

    /* renamed from: e2 */
    private final C27267c3 m89979e2() {
        C27267c3 c3Var = this.f74824F;
        C41536l.m120486f(c3Var);
        return c3Var;
    }

    /* renamed from: f2 */
    private final int m89980f2() {
        return ((Number) this.f74822D.getValue()).intValue();
    }

    /* renamed from: g2 */
    private final int m89981g2() {
        return ((Number) this.f74821C.getValue()).intValue();
    }

    /* renamed from: h2 */
    private final int m89982h2() {
        return ((Number) this.f74820B.getValue()).intValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m89983i2(C29649b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        C29651b bVar2 = bVar.f74823E;
        if (bVar2 != null) {
            bVar2.mo53866t0();
        }
        bVar.mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f74824F = C27267c3.m84369d(layoutInflater, viewGroup, true);
    }

    public void onAttach(Context context) {
        C29651b bVar;
        C41536l.m120489i(context, "context");
        super.onAttach(context);
        if (context instanceof C29651b) {
            this.f74823E = (C29651b) context;
        } else if (getParentFragment() instanceof C29651b) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment instanceof C29651b) {
                bVar = (C29651b) parentFragment;
            } else {
                bVar = null;
            }
            this.f74823E = bVar;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        mo26370a2(getString(m89982h2()));
        m89979e2().f68468f.setText(getString(m89981g2()));
        m89979e2().f68467e.setButtonText(getString(m89980f2()));
        m89979e2().f68467e.setOnClickListener(new C29648a(this));
    }
}
