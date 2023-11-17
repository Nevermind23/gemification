package ab1;

import ab1.C30941e;
import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.C0218d;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.p016os.C0908e;
import androidx.core.widget.C1314o;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1619q;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10146d0;
import ba1.C10195g0;
import ba1.C10213r;
import ba1.C10214s;
import ba1.C10220y;
import bb1.C31153a;
import cb1.C31359a;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import db1.C31551a;
import db1.C31554d;
import eb1.C31705i;
import gb1.C32366c;
import gb1.C32392v;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41217g;
import he1.C41222k;
import he1.C41232r;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import oa1.C26917a;
import oa1.C26918b;
import p045d.C5769a;
import p217q2.C7833e;
import p341ge.bog.designsystem.components.actionsheet.additionalactions.model.AdditionalAction;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.sso_client.common.sheets.C24683b;
import p341ge.bog.sso_client.common.sheets.C24688e;
import p341ge.bog.sso_client.common.sheets.UsernameInputActionSheet;
import p341ge.bog.sso_client.common.util.crop.CropImageActivity;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.CountryCode;
import p341ge.bog.sso_client.onboarding.steps.phone.CountryCodeActionSheet;
import p341ge.bog.sso_client.tmx_profiling.TMXFlags;
import p363bh.C10277c;
import p420fh.C12902d;
import p434gh.C15278a;
import p519mi.C16686a;
import p601sg.C17777b;
import p601sg.C17778c;
import p601sg.C17780e;
import p601sg.C17786k;
import p642vh.C18368l;
import sso.queery.AddContactQuery;
import sso.queery.RemoveContactQuery;
import sso.type.ContactType;
import ua1.C28684u;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import ue1.C43080q;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: ab1.u */
public final class C30965u extends Fragment implements C41185v.C41186a, C30941e.C30943b {

    /* renamed from: q */
    public static final C30968b f77105q = new C30968b((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C30972d f77106d;

    /* renamed from: e */
    private Uri f77107e;

    /* renamed from: f */
    private C28684u f77108f;

    /* renamed from: g */
    private final C41217g f77109g = C41219i.m119469a(C41222k.NONE, new C30983i0(this, (C41806a) null, (C43064a) null, new C30981h0(this), (C43064a) null));

    /* renamed from: h */
    private final C41217g f77110h;

    /* renamed from: i */
    private C30966a f77111i;

    /* renamed from: j */
    private final C31153a f77112j;

    /* renamed from: k */
    private final C31153a f77113k;

    /* renamed from: l */
    private final C31153a f77114l;

    /* renamed from: m */
    private C43080q f77115m;

    /* renamed from: n */
    private int f77116n;

    /* renamed from: o */
    private String f77117o;

    /* renamed from: p */
    private final C41217g f77118p;

    /* renamed from: ab1.u$a */
    private interface C30966a {
        /* renamed from: a */
        void mo71166a(C30972d dVar);
    }

    /* renamed from: ab1.u$a0 */
    /* synthetic */ class C30967a0 extends C41535k implements C43075l {
        C30967a0(Object obj) {
            super(1, obj, C30965u.class, "setLoading", "setLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo71174b(boolean z) {
            ((C30965u) this.receiver).m92217D2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71174b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$b */
    public static final class C30968b {
        private C30968b() {
        }

        public /* synthetic */ C30968b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C30965u mo71175a(boolean z) {
            C30965u uVar = new C30965u();
            Bundle bundle = new Bundle();
            bundle.putBoolean("HAS_KYC_ARG", z);
            uVar.setArguments(bundle);
            return uVar;
        }
    }

    /* renamed from: ab1.u$b0 */
    /* synthetic */ class C30969b0 extends C41535k implements C43075l {
        C30969b0(Object obj) {
            super(1, obj, C30965u.class, "onError", "onError(Lge/bog/sso_client/models/Result$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo71176b(C35947l.C35949b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((C30965u) this.receiver).m92284r2(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71176b((C35947l.C35949b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$c */
    public static final class C30970c extends RecyclerView.C1746o {

        /* renamed from: a */
        private final Drawable f77119a;

        public C30970c(Drawable drawable) {
            C41536l.m120489i(drawable, "mDivider");
            this.f77119a = drawable;
        }

        /* renamed from: i */
        public void mo5619i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
            C41536l.m120489i(canvas, "c");
            C41536l.m120489i(recyclerView, "parent");
            C41536l.m120489i(b0Var, "state");
            int paddingLeft = recyclerView.getPaddingLeft();
            int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount() - 2;
            if (childCount >= 0) {
                int i = 0;
                while (true) {
                    View childAt = recyclerView.getChildAt(i);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams != null) {
                        int bottom = childAt.getBottom() + ((RecyclerView.C1752q) layoutParams).bottomMargin;
                        this.f77119a.setBounds(paddingLeft, bottom, width, this.f77119a.getIntrinsicHeight() + bottom);
                        this.f77119a.draw(canvas);
                        if (i != childCount) {
                            i++;
                        } else {
                            return;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                    }
                }
            }
        }
    }

    /* renamed from: ab1.u$c0 */
    /* synthetic */ class C30971c0 extends C41535k implements C43079p {
        C30971c0(Object obj) {
            super(2, obj, C30965u.class, "onPhoneNumberOptionsClicked", "onPhoneNumberOptionsClicked(Lge/bog/sso_client/editprofile/presentation/model/ContactInfo;I)V", 0);
        }

        /* renamed from: b */
        public final void mo71177b(C31551a aVar, int i) {
            C41536l.m120489i(aVar, "p0");
            ((C30965u) this.receiver).m92290u2(aVar, i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo71177b((C31551a) obj, ((Number) obj2).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$d */
    public enum C30972d {
        EDIT,
        DELETE,
        CHANGE_PICTURE_CHOOSE_FROM_GALLERY,
        CHANGE_PICTURE_TAKE_PHOTO,
        FAVORITE
    }

    /* renamed from: ab1.u$d0 */
    /* synthetic */ class C30973d0 extends C41535k implements C43079p {
        C30973d0(Object obj) {
            super(2, obj, C30965u.class, "onEmailOptionsClicked", "onEmailOptionsClicked(Lge/bog/sso_client/editprofile/presentation/model/ContactInfo;I)V", 0);
        }

        /* renamed from: b */
        public final void mo71178b(C31551a aVar, int i) {
            C41536l.m120489i(aVar, "p0");
            ((C30965u) this.receiver).m92280p2(aVar, i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo71178b((C31551a) obj, ((Number) obj2).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$e */
    public /* synthetic */ class C30974e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f77126a;

        static {
            int[] iArr = new int[C30972d.values().length];
            iArr[C30972d.CHANGE_PICTURE_TAKE_PHOTO.ordinal()] = 1;
            iArr[C30972d.CHANGE_PICTURE_CHOOSE_FROM_GALLERY.ordinal()] = 2;
            iArr[C30972d.DELETE.ordinal()] = 3;
            iArr[C30972d.FAVORITE.ordinal()] = 4;
            iArr[C30972d.EDIT.ordinal()] = 5;
            f77126a = iArr;
        }
    }

    /* renamed from: ab1.u$e0 */
    static final class C30975e0 extends C41537m implements C43080q {

        /* renamed from: d */
        final /* synthetic */ C30965u f77127d;

        /* renamed from: e */
        final /* synthetic */ C31551a f77128e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30975e0(C30965u uVar, C31551a aVar) {
            super(3);
            this.f77127d = uVar;
            this.f77128e = aVar;
        }

        /* renamed from: a */
        public final void mo71179a(String str, String str2, String str3) {
            C41536l.m120489i(str, "operationId");
            C41536l.m120489i(str2, "operationReference");
            C41536l.m120489i(str3, "otp");
            this.f77127d.m92272l2().mo72129Pw(this.f77128e.mo71961c(), str, str2, str3);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo71179a((String) obj, (String) obj2, (String) obj3);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$f */
    static final class C30976f extends C41537m implements C43080q {

        /* renamed from: d */
        final /* synthetic */ C30965u f77129d;

        /* renamed from: e */
        final /* synthetic */ String f77130e;

        /* renamed from: f */
        final /* synthetic */ ContactType f77131f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30976f(C30965u uVar, String str, ContactType contactType) {
            super(3);
            this.f77129d = uVar;
            this.f77130e = str;
            this.f77131f = contactType;
        }

        /* renamed from: a */
        public final void mo71180a(String str, String str2, String str3) {
            C41536l.m120489i(str, "operationId");
            C41536l.m120489i(str2, "operationReference");
            C41536l.m120489i(str3, "scaAuthCode");
            this.f77129d.m92272l2().mo72126Lw(this.f77130e, this.f77131f, str2, str, str3);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo71180a((String) obj, (String) obj2, (String) obj3);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$f0 */
    public static final class C30977f0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f77132d;

        /* renamed from: e */
        final /* synthetic */ C41806a f77133e;

        /* renamed from: f */
        final /* synthetic */ C43064a f77134f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30977f0(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f77132d = componentCallbacks;
            this.f77133e = aVar;
            this.f77134f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f77132d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C32366c.class), this.f77133e, this.f77134f);
        }
    }

    /* renamed from: ab1.u$g */
    static final class C30978g extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C30965u f77135d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30978g(C30965u uVar) {
            super(2);
            this.f77135d = uVar;
        }

        /* renamed from: a */
        public final void mo71181a(String str, Bundle bundle) {
            C41536l.m120489i(str, "<anonymous parameter 0>");
            C41536l.m120489i(bundle, "bundle");
            String string = bundle.getString("UsernameInputActionSheet.USER_NAME_INPUT_TEXT");
            if (string != null) {
                this.f77135d.m92272l2().mo72132Vw(string);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo71181a((String) obj, (Bundle) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$g0 */
    public static final class C30979g0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f77136d;

        /* renamed from: e */
        final /* synthetic */ C41806a f77137e;

        /* renamed from: f */
        final /* synthetic */ C43064a f77138f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30979g0(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f77136d = componentCallbacks;
            this.f77137e = aVar;
            this.f77138f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f77136d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f77137e, this.f77138f);
        }
    }

    /* renamed from: ab1.u$h */
    static final class C30980h extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C30965u f77139d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30980h(C30965u uVar) {
            super(2);
            this.f77139d = uVar;
        }

        /* renamed from: a */
        public final void mo71182a(String str, Bundle bundle) {
            C41536l.m120489i(str, "<anonymous parameter 0>");
            C41536l.m120489i(bundle, "<anonymous parameter 1>");
            this.f77139d.m92272l2().mo72128Ow();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo71182a((String) obj, (Bundle) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$h0 */
    public static final class C30981h0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f77140d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30981h0(Fragment fragment) {
            super(0);
            this.f77140d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            Fragment fragment = this.f77140d;
            return aVar.mo102076a(fragment, fragment);
        }
    }

    /* renamed from: ab1.u$i */
    static final class C30982i extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C30965u f77141d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30982i(C30965u uVar) {
            super(2);
            this.f77141d = uVar;
        }

        /* renamed from: a */
        public final void mo71184a(String str, Bundle bundle) {
            C41536l.m120489i(str, "<anonymous parameter 0>");
            C41536l.m120489i(bundle, "b");
            String string = bundle.getString("BUNDLE_PARAM_PHONE_NUMBER");
            if (string != null) {
                this.f77141d.m92255Z1(string);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo71184a((String) obj, (Bundle) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$i0 */
    public static final class C30983i0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f77142d;

        /* renamed from: e */
        final /* synthetic */ C41806a f77143e;

        /* renamed from: f */
        final /* synthetic */ C43064a f77144f;

        /* renamed from: g */
        final /* synthetic */ C43064a f77145g;

        /* renamed from: h */
        final /* synthetic */ C43064a f77146h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30983i0(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f77142d = fragment;
            this.f77143e = aVar;
            this.f77144f = aVar2;
            this.f77145g = aVar3;
            this.f77146h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f77142d, this.f77143e, this.f77144f, this.f77145g, C41520a0.m120436b(C31705i.class), this.f77146h);
        }
    }

    /* renamed from: ab1.u$j */
    static final class C30984j extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C30965u f77147d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30984j(C30965u uVar) {
            super(2);
            this.f77147d = uVar;
        }

        /* renamed from: a */
        public final void mo71186a(String str, Bundle bundle) {
            C41536l.m120489i(str, "<anonymous parameter 0>");
            C41536l.m120489i(bundle, "b");
            CountryCode countryCode = (CountryCode) bundle.getParcelable("FRAGMENT_RESULT_BUNDLE_CODE");
            if (countryCode != null) {
                C24688e z1 = this.f77147d.m92268j2();
                z1.mo63084i2('+' + countryCode.mo88219a());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo71186a((String) obj, (Bundle) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$k */
    static final class C30985k extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C30965u f77148d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30985k(C30965u uVar) {
            super(2);
            this.f77148d = uVar;
        }

        /* renamed from: a */
        public final void mo71187a(String str, Bundle bundle) {
            C41536l.m120489i(str, "<anonymous parameter 0>");
            C41536l.m120489i(bundle, "b");
            String string = bundle.getString("RESULT_BUNDLE_TAG_EMAIL_INPUT");
            if (string != null) {
                this.f77148d.m92243S1(string);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo71187a((String) obj, (Bundle) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$l */
    static final class C30986l extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C30965u f77149d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30986l(C30965u uVar) {
            super(2);
            this.f77149d = uVar;
        }

        /* renamed from: a */
        public final void mo71188a(String str, Bundle bundle) {
            C41536l.m120489i(str, "<anonymous parameter 0>");
            C41536l.m120489i(bundle, "b");
            Enum enumR = (Enum) bundle.getSerializable("AdditionalActionsActionSheet.RESULT_KEY");
            if (enumR != null) {
                this.f77149d.m92296y0(enumR);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo71188a((String) obj, (Bundle) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$m */
    /* synthetic */ class C30987m extends C41535k implements C43075l {
        C30987m(Object obj) {
            super(1, obj, C30965u.class, "setLoading", "setLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo71189b(boolean z) {
            ((C30965u) this.receiver).m92217D2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71189b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$n */
    /* synthetic */ class C30988n extends C41535k implements C43075l {
        C30988n(Object obj) {
            super(1, obj, C30965u.class, "onError", "onError(Lge/bog/sso_client/models/Result$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo71190b(C35947l.C35949b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((C30965u) this.receiver).m92284r2(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71190b((C35947l.C35949b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$o */
    /* synthetic */ class C30989o extends C41535k implements C43075l {
        C30989o(Object obj) {
            super(1, obj, C30965u.class, "setLoading", "setLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo71191b(boolean z) {
            ((C30965u) this.receiver).m92217D2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71191b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$p */
    /* synthetic */ class C30990p extends C41535k implements C43075l {
        C30990p(Object obj) {
            super(1, obj, C30965u.class, "onError", "onError(Lge/bog/sso_client/models/Result$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo71192b(C35947l.C35949b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((C30965u) this.receiver).m92284r2(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71192b((C35947l.C35949b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$q */
    /* synthetic */ class C30991q extends C41535k implements C43075l {
        C30991q(Object obj) {
            super(1, obj, C30965u.class, "setLoading", "setLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo71193b(boolean z) {
            ((C30965u) this.receiver).m92217D2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71193b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$r */
    /* synthetic */ class C30992r extends C41535k implements C43075l {
        C30992r(Object obj) {
            super(1, obj, C30965u.class, "onError", "onError(Lge/bog/sso_client/models/Result$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo71194b(C35947l.C35949b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((C30965u) this.receiver).m92284r2(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71194b((C35947l.C35949b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$s */
    /* synthetic */ class C30993s extends C41535k implements C43075l {
        C30993s(Object obj) {
            super(1, obj, C30965u.class, "setLoading", "setLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo71195b(boolean z) {
            ((C30965u) this.receiver).m92217D2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71195b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$t */
    /* synthetic */ class C30994t extends C41535k implements C43075l {
        C30994t(Object obj) {
            super(1, obj, C30965u.class, "onError", "onError(Lge/bog/sso_client/models/Result$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo71196b(C35947l.C35949b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((C30965u) this.receiver).m92284r2(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71196b((C35947l.C35949b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$u */
    static final class C30995u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C30965u f77150d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30995u(C30965u uVar) {
            super(1);
            this.f77150d = uVar;
        }

        /* renamed from: a */
        public final void mo71197a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f77150d.m92298y2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71197a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$v */
    /* synthetic */ class C30996v extends C41535k implements C43075l {
        C30996v(Object obj) {
            super(1, obj, C30965u.class, "setLoading", "setLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo71198b(boolean z) {
            ((C30965u) this.receiver).m92217D2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71198b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$w */
    /* synthetic */ class C30997w extends C41535k implements C43075l {
        C30997w(Object obj) {
            super(1, obj, C30965u.class, "onUserInfoError", "onUserInfoError(Lge/bog/sso_client/models/Result$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo71199b(C35947l.C35949b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((C30965u) this.receiver).m92300z2(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71199b((C35947l.C35949b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$x */
    /* synthetic */ class C30998x extends C41535k implements C43075l {
        C30998x(Object obj) {
            super(1, obj, C30965u.class, "onUserInfoLoaded", "onUserInfoLoaded(Lge/bog/sso_client/editprofile/presentation/model/UserInfoUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo71200b(C31554d dVar) {
            C41536l.m120489i(dVar, "p0");
            ((C30965u) this.receiver).m92211A2(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71200b((C31554d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$y */
    /* synthetic */ class C30999y extends C41535k implements C43075l {
        C30999y(Object obj) {
            super(1, obj, C30965u.class, "setLoading", "setLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo71201b(boolean z) {
            ((C30965u) this.receiver).m92217D2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71201b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ab1.u$z */
    /* synthetic */ class C31000z extends C41535k implements C43075l {
        C31000z(Object obj) {
            super(1, obj, C30965u.class, "onError", "onError(Lge/bog/sso_client/models/Result$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo71202b(C35947l.C35949b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((C30965u) this.receiver).m92284r2(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71202b((C35947l.C35949b) obj);
            return C41238w.f97225a;
        }
    }

    public C30965u() {
        C41222k kVar = C41222k.SYNCHRONIZED;
        this.f77110h = C41219i.m119469a(kVar, new C30977f0(this, (C41806a) null, (C43064a) null));
        this.f77112j = new C31153a((C31153a.C31154a) null, 1, (DefaultConstructorMarker) null);
        this.f77113k = new C31153a((C31153a.C31154a) null, 1, (DefaultConstructorMarker) null);
        this.f77114l = new C31153a(C31153a.C31154a.TWO_LINE);
        this.f77118p = C41219i.m119469a(kVar, new C30979g0(this, (C41806a) null, (C43064a) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public final void m92211A2(C31554d dVar) {
        C28684u uVar = this.f77108f;
        if (uVar != null) {
            m92261f2(dVar);
            m92260e2(dVar);
            m92228J2(uVar, dVar);
            uVar.f72961J.setChecked(dVar.mo71978e());
            uVar.f72966O.setText(dVar.mo71974a());
        }
    }

    /* renamed from: B2 */
    private final void m92213B2(C31551a aVar) {
        m92246T2("CommonServices.removeContact", new HashMap(C26918b.m83691c(new RemoveContactQuery(aVar.mo71961c(), (C7833e) null, (C7833e) null, (C7833e) null, 14, (DefaultConstructorMarker) null).variables().valueMap())), new C30975e0(this, aVar));
    }

    /* renamed from: C2 */
    private final void m92215C2(C28684u uVar) {
        for (LayerView layerView : C41341q.m119910m(uVar.f72990u, uVar.f72956E, uVar.f72987r, uVar.f72979j)) {
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            layerView.setBackgroundColor(C18368l.m62755d(requireContext, C17777b.f49596k));
            layerView.setLayerStyle(C17786k.f49838y);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public final void m92217D2(boolean z) {
        if (z) {
            this.f77116n++;
        } else {
            int i = this.f77116n - 1;
            this.f77116n = i;
            if (i < 0) {
                i = 0;
            }
            this.f77116n = i;
        }
        m92256a2();
    }

    /* renamed from: E2 */
    private final void m92219E2(RecyclerView... recyclerViewArr) {
        int length = recyclerViewArr.length;
        int i = 0;
        while (i < length) {
            RecyclerView recyclerView = recyclerViewArr[i];
            Drawable b = C5769a.m23210b(requireContext(), C17780e.f49660V);
            if (b != null) {
                C41536l.m120488h(b, "requireNotNull(\n        …          )\n            )");
                recyclerView.mo5351j(new C30970c(b));
                i++;
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
    }

    /* renamed from: F2 */
    private final void m92221F2(Uri uri, CropImageActivity.C24696a aVar) {
        if (uri != null) {
            aVar.mo63102c(uri);
        }
    }

    /* renamed from: H2 */
    private final void m92224H2(C28684u uVar) {
        boolean z;
        int i;
        String str;
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("HAS_KYC_ARG", false);
        } else {
            z = false;
        }
        InlineFeedback inlineFeedback = uVar.f72995z;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        inlineFeedback.setVisibility(i);
        uVar.f72995z.setInteractiveButtonText(getString(C10220y.update));
        uVar.f72995z.setCloseButtonVisibility(false);
        InlineFeedback inlineFeedback2 = uVar.f72995z;
        C10195g0 g = m92264h2().mo26716g();
        if (g != null) {
            str = g.mo26763a("rbc.kyc.survery.popup.description", new Object[0]);
        } else {
            str = null;
        }
        inlineFeedback2.setTitleText(str);
        uVar.f72995z.setOnInteractiveButtonClickListener(new C30962r(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public static final void m92226I2(C30965u uVar, View view) {
        C41536l.m120489i(uVar, "this$0");
        C1533o.m5445b(uVar, "EditProfileFragment.REQUEST_TAG_KYC_CLICKED", new Bundle());
    }

    /* renamed from: J1 */
    private final void m92227J1(C28684u uVar) {
        uVar.f72975f.setOnClickListener(new C30956l(this));
        uVar.f72974e.setOnClickListener(new C30957m(this, uVar));
        uVar.f72983n.setOnClickListener(new C30958n(this));
        uVar.f72982m.setOnClickListener(new C30959o(this));
        uVar.f72961J.setOnClickListener(new C30960p(this));
        uVar.f72963L.setOnClickListener(new C30961q(this));
    }

    /* renamed from: J2 */
    private final void m92228J2(C28684u uVar, C31554d dVar) {
        int i;
        if (dVar.mo71982h()) {
            i = (int) requireContext().getResources().getDimension(C10213r.spacing_2xs);
        } else {
            i = 0;
        }
        uVar.f72994y.setPadding(i, i, i, i);
        ((C2394j) ((C2394j) ((C2394j) C2379b.m9210t(requireContext()).mo7757y(dVar.mo71980f()).mo7242o0(true)).mo7232j(C10214s.f28280o)).mo7222d()).mo7718L0(uVar.f72994y);
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public static final void m92229K1(C30965u uVar, View view) {
        C41536l.m120489i(uVar, "this$0");
        uVar.m92276n2();
        uVar.m92272l2().mo72127Nw();
    }

    /* renamed from: K2 */
    private final void m92230K2(C28684u uVar) {
        uVar.f72957F.setAdapter(this.f77112j);
        uVar.f72988s.setAdapter(this.f77113k);
        uVar.f72980k.setAdapter(this.f77114l);
        RecyclerView recyclerView = uVar.f72988s;
        C41536l.m120488h(recyclerView, "binding.emailListRecycler");
        RecyclerView recyclerView2 = uVar.f72957F;
        C41536l.m120488h(recyclerView2, "binding.phoneNumberListRecycler");
        RecyclerView recyclerView3 = uVar.f72980k;
        C41536l.m120488h(recyclerView3, "binding.addressListRecycler");
        m92219E2(recyclerView, recyclerView2, recyclerView3);
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public static final void m92231L1(C30965u uVar, View view) {
        C41536l.m120489i(uVar, "this$0");
        uVar.m92272l2().mo72135bx(TMXFlags.TMX_FLAG_ADD_FIN_PHONE_KEY);
        C24688e j2 = uVar.m92268j2();
        if (!j2.isAdded()) {
            j2.mo4576A1(uVar.getChildFragmentManager(), "PHONE_ACTION_SHEET_TAG");
        }
    }

    /* renamed from: L2 */
    private final void m92232L2(C28684u uVar) {
        C1314o.m4566h(uVar.f72969R, 11, 14, 1, 2);
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public static final void m92233M1(C30965u uVar, C28684u uVar2, View view) {
        C41536l.m120489i(uVar, "this$0");
        C41536l.m120489i(uVar2, "$binding");
        uVar.m92272l2().mo72135bx(TMXFlags.TMX_FLAG_ADD_FIN_CONTACT_KEY);
        C24683b.C24684a aVar = C24683b.f63561C;
        String string = uVar2.f72965N.getContext().getString(C10220y.common_text_add_email);
        C41536l.m120488h(string, "binding.root.context.get…ng.common_text_add_email)");
        aVar.mo63077a(string).mo4576A1(uVar.getChildFragmentManager(), (String) null);
    }

    /* renamed from: M2 */
    private final void m92234M2(List list, String str, C30966a aVar) {
        this.f77111i = aVar;
        C10277c.C10278a aVar2 = C10277c.f28509D;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m92252W2((C30972d) it.next()));
        }
        C10277c.C10278a.m37472b(aVar2, str, arrayList, (String) null, (C16686a) null, 12, (Object) null).mo4576A1(getChildFragmentManager(), "ADDITIONAL_ACTION_SHEET_TAG");
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public static final void m92235N1(C30965u uVar, View view) {
        C41536l.m120489i(uVar, "this$0");
        m92237O2(uVar, C41339p.m119900e(C30972d.EDIT), (String) null, new C30952h(uVar), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public static final void m92236O1(C30965u uVar, C30972d dVar) {
        C41536l.m120489i(uVar, "this$0");
        C41536l.m120489i(dVar, "it");
        uVar.m92272l2().mo72134ax();
        uVar.m92258c2();
    }

    /* renamed from: O2 */
    static /* synthetic */ void m92237O2(C30965u uVar, List list, String str, C30966a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            str = uVar.getString(C10220y.additional_options);
            C41536l.m120488h(str, "getString(R.string.additional_options)");
        }
        uVar.m92234M2(list, str, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public static final void m92238P1(C30965u uVar, View view) {
        C41536l.m120489i(uVar, "this$0");
        uVar.m92293w2();
    }

    /* renamed from: P2 */
    private final void m92239P2(List list) {
        CountryCodeActionSheet a = CountryCodeActionSheet.f87075G.mo88704a(list);
        a.mo26370a2(getString(C10220y.onboarding_choose_country_code));
        a.mo88693j2(list);
        a.mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public static final void m92240Q1(C30965u uVar, View view) {
        C41536l.m120489i(uVar, "this$0");
        SwitchCompat switchCompat = (SwitchCompat) view;
        if (switchCompat != null) {
            uVar.m92272l2().mo72131Tw(C26918b.m83689a(switchCompat));
        }
    }

    /* renamed from: R1 */
    private final void m92241R1(String str, ContactType contactType) {
        HashMap hashMap = new HashMap(C26918b.m83691c(new AddContactQuery(str, contactType, (C7833e) null, (C7833e) null, (C7833e) null, 28, (DefaultConstructorMarker) null).variables().valueMap()));
        hashMap.put("tmxSessionId", C10146d0.C10177h.m37232a());
        m92244S2("CommonServices.addContact", hashMap, new C30976f(this, str, contactType));
    }

    /* renamed from: R2 */
    private final void m92242R2(String str) {
        String str2;
        C28684u uVar = this.f77108f;
        if (uVar != null) {
            int i = 0;
            uVar.f72989t.setVisibility(0);
            TextView textView = uVar.f72964M;
            if (str != null) {
                str2 = str;
            } else {
                str2 = "";
            }
            textView.setText(str2);
            TextView textView2 = uVar.f72964M;
            if (str == null) {
                i = 8;
            }
            textView2.setVisibility(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public final void m92243S1(String str) {
        m92241R1(str, ContactType.MAIL);
    }

    /* renamed from: S2 */
    private final void m92244S2(String str, HashMap hashMap, C43080q qVar) {
        this.f77115m = qVar;
        C41185v c = C41185v.f97155C.mo95638c(str, hashMap, C41143c.OTP);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        c.mo4576A1(childFragmentManager, (String) null);
    }

    /* renamed from: T1 */
    private final void m92245T1(String str, C43079p pVar) {
        getChildFragmentManager().mo4367F1(str, this, new C30950f(pVar));
    }

    /* renamed from: T2 */
    private final void m92246T2(String str, HashMap hashMap, C43080q qVar) {
        this.f77115m = qVar;
        C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, str, hashMap, (C41143c) null, 4, (Object) null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        e.mo4576A1(childFragmentManager, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public static final void m92247U1(C43079p pVar, String str, Bundle bundle) {
        C41536l.m120489i(pVar, "$tmp0");
        C41536l.m120489i(str, "p0");
        C41536l.m120489i(bundle, "p1");
        pVar.invoke(str, bundle);
    }

    /* renamed from: U2 */
    private final void m92248U2(List list, String str) {
        UsernameInputActionSheet.f63545E.mo63070a(list, str).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* renamed from: V1 */
    private final void m92249V1() {
        m92245T1("UsernameInputActionSheet.RESULT_TAG_USERNAME_INPUT", new C30978g(this));
        m92245T1("REQUEST_TAG_COUNTRY_CODE_REQUESTED", new C30980h(this));
        m92245T1("REQUEST_TAG_PHONE_NUMBER_SUBMITTED", new C30982i(this));
        m92245T1("FRAGMENT_RESULT_TAG_CODE_SUBMITTED", new C30984j(this));
        m92245T1("REQUEST_TAG_EMAIL_INPUT", new C30985k(this));
        m92245T1("AdditionalActionsActionSheet.REQUEST_TAG", new C30986l(this));
    }

    /* renamed from: V2 */
    private final void m92250V2() {
        this.f77107e = C26917a.m83686d(this, m92266i2());
    }

    /* renamed from: W1 */
    private final void m92251W1() {
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C31705i l2 = m92272l2();
        C32392v.m95653e(l2.mo72121Dw(), viewLifecycleOwner, new C30998x(this), new C30996v(this), new C30997w(this));
        l2.mo72140zw().mo4819k(viewLifecycleOwner, new C30963s(this));
        C1619q qVar = viewLifecycleOwner;
        C32392v.m95654f(l2.mo72139yw(), qVar, (C43075l) null, new C30999y(this), new C31000z(this), 2, (Object) null);
        C32392v.m95654f(l2.mo72138xw(), qVar, (C43075l) null, new C30967a0(this), new C30969b0(this), 2, (Object) null);
        m92272l2().mo72122Ew().mo4819k(viewLifecycleOwner, new C30964t(this));
        C1619q qVar2 = viewLifecycleOwner;
        C32392v.m95654f(l2.mo72120Cw(), qVar2, (C43075l) null, new C30987m(this), new C30988n(this), 2, (Object) null);
        C32392v.m95654f(l2.mo72119Bw(), qVar2, (C43075l) null, new C30989o(this), new C30990p(this), 2, (Object) null);
        C32392v.m95654f(l2.mo72118Aw(), qVar2, (C43075l) null, new C30991q(this), new C30992r(this), 2, (Object) null);
        l2.mo72123Fw().mo4819k(viewLifecycleOwner, new C30951g(this));
        C32392v.m95653e(l2.mo72124Gw(), viewLifecycleOwner, new C30995u(this), new C30993s(this), new C30994t(this));
    }

    /* renamed from: W2 */
    private final AdditionalAction m92252W2(C30972d dVar) {
        int i = C30974e.f77126a[dVar.ordinal()];
        if (i == 1) {
            String string = getString(C10220y.take_photo);
            C41536l.m120488h(string, "getString(R.string.take_photo)");
            return new AdditionalAction(string, dVar, 0, Integer.valueOf(C17780e.icons_24_system_camera_outline), Integer.valueOf(C17778c.f49637v), 4, (DefaultConstructorMarker) null);
        } else if (i == 2) {
            String string2 = getString(C10220y.choose_from_gallery);
            C41536l.m120488h(string2, "getString(R.string.choose_from_gallery)");
            return new AdditionalAction(string2, dVar, 0, Integer.valueOf(C17780e.icons_24_system_crop), Integer.valueOf(C17778c.f49637v), 4, (DefaultConstructorMarker) null);
        } else if (i == 3) {
            String string3 = getString(C10220y.f28401t0);
            C41536l.m120488h(string3, "getString(R.string.common_text_delete)");
            return new AdditionalAction(string3, dVar, C17786k.f49824P, Integer.valueOf(C17780e.f49650F), Integer.valueOf(C17778c.f49605C));
        } else if (i == 4) {
            String string4 = getString(C10220y.make_favorite);
            C41536l.m120488h(string4, "getString(R.string.make_favorite)");
            return new AdditionalAction(string4, dVar, 0, Integer.valueOf(C17780e.f49654L), Integer.valueOf(C17778c.f49637v), 4, (DefaultConstructorMarker) null);
        } else if (i == 5) {
            String string5 = getString(C10220y.common_text_edit);
            C41536l.m120488h(string5, "getString(R.string.common_text_edit)");
            return new AdditionalAction(string5, dVar, C17786k.f49823N, Integer.valueOf(C17780e.icons_24_system_edit), Integer.valueOf(C17778c.f49637v));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public static final void m92253X1(C30965u uVar, List list) {
        C41536l.m120489i(uVar, "this$0");
        C41536l.m120488h(list, "it");
        uVar.m92239P2(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public static final void m92254Y1(C30965u uVar, C35947l lVar) {
        C41536l.m120489i(uVar, "this$0");
        if (lVar instanceof C35947l.C35951d) {
            uVar.m92217D2(false);
            C35947l.C35951d dVar = (C35947l.C35951d) lVar;
            uVar.m92286s2(((Boolean) ((C41232r) dVar.mo88520a()).mo95691d()).booleanValue(), (String) ((C41232r) dVar.mo88520a()).mo95692e(), (String) ((C41232r) dVar.mo88520a()).mo95694f());
        } else if (lVar instanceof C35947l.C35949b) {
            uVar.m92217D2(false);
            C41536l.m120488h(lVar, "result");
            uVar.m92284r2((C35947l.C35949b) lVar);
        } else if (lVar instanceof C35947l.C35950c) {
            uVar.m92217D2(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public final void m92255Z1(String str) {
        m92241R1(str, ContactType.PHONE);
    }

    /* renamed from: a2 */
    private final void m92256a2() {
        C31359a aVar = (C31359a) getActivity();
        if (aVar != null) {
            aVar.mo55693i(this.f77116n > 0);
        }
    }

    /* renamed from: b2 */
    private final void m92257b2() {
        C26917a.m83688f(this);
    }

    /* renamed from: c2 */
    private final void m92258c2() {
        C10277c cVar = (C10277c) getChildFragmentManager().mo4418k0("ADDITIONAL_ACTION_SHEET_TAG");
        if (cVar != null) {
            cVar.mo4577k1();
        }
    }

    /* renamed from: d2 */
    private final void m92259d2() {
        C41185v k2 = m92270k2();
        if (k2 != null) {
            k2.mo4577k1();
        }
    }

    /* renamed from: e2 */
    private final void m92260e2(C31554d dVar) {
        this.f77112j.mo71366o(dVar.mo71975b(), new C30971c0(this));
        this.f77113k.mo71366o(dVar.mo71976c(), new C30973d0(this));
        this.f77114l.mo6029i(C41339p.m119900e(new C31551a("", dVar.mo71974a(), false, false, 4, (DefaultConstructorMarker) null)));
    }

    /* renamed from: f2 */
    private final void m92261f2(C31554d dVar) {
        C28684u uVar = this.f77108f;
        if (uVar != null) {
            uVar.f72969R.setText(dVar.mo71977d());
            uVar.f72972U.setText(dVar.mo71981g());
            uVar.f72968Q.setText(dVar.mo71977d());
        }
    }

    /* renamed from: g2 */
    private final String m92262g2() {
        return m92264h2().mo26726q().mo92939a();
    }

    /* renamed from: h2 */
    private final C10146d0.C10172e m92264h2() {
        return (C10146d0.C10172e) this.f77118p.getValue();
    }

    /* renamed from: i2 */
    private final C32366c m92266i2() {
        return (C32366c) this.f77110h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final C24688e m92268j2() {
        C24688e eVar = (C24688e) getChildFragmentManager().mo4418k0("PHONE_ACTION_SHEET_TAG");
        if (eVar == null) {
            return C24688e.f63568D.mo63085a();
        }
        return eVar;
    }

    /* renamed from: k2 */
    private final C41185v m92270k2() {
        Fragment k0 = getChildFragmentManager().mo4418k0("ScaVerificationDialogFragment");
        if (k0 instanceof C41185v) {
            return (C41185v) k0;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public final C31705i m92272l2() {
        return (C31705i) this.f77109g.getValue();
    }

    /* renamed from: m2 */
    private final boolean m92274m2(int i) {
        if (i == -1) {
            CropImageActivity.C24696a d = new CropImageActivity.C24696a().mo63101b(1, 1).mo63103d(true);
            Uri uri = this.f77107e;
            if (uri == null) {
                return false;
            }
            m92221F2(uri, d);
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            d.mo63104e(requireContext, this);
        }
        return false;
    }

    /* renamed from: n2 */
    private final void m92276n2() {
        C28684u uVar = this.f77108f;
        Group group = uVar != null ? uVar.f72989t : null;
        if (group != null) {
            group.setVisibility(8);
        }
    }

    /* renamed from: o2 */
    private final void m92278o2(C31551a aVar, boolean z, String str, String str2) {
        this.f77117o = aVar.mo71961c();
        C31705i l2 = m92272l2();
        String str3 = this.f77117o;
        if (str3 == null) {
            C41536l.m120506z("contactId");
            str3 = null;
        }
        l2.mo72125Hw(str3, z, str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public final void m92280p2(C31551a aVar, int i) {
        m92237O2(this, C41341q.m119910m(C30972d.FAVORITE, C30972d.DELETE), (String) null, new C30955k(this, aVar), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static final void m92282q2(C30965u uVar, C31551a aVar, C30972d dVar) {
        C41536l.m120489i(uVar, "this$0");
        C41536l.m120489i(aVar, "$info");
        C41536l.m120489i(dVar, "it");
        int i = C30974e.f77126a[dVar.ordinal()];
        if (i == 3) {
            uVar.m92213B2(aVar);
        } else if (i == 4) {
            uVar.m92278o2(aVar, false, TMXFlags.TMX_FLAG_FIN_CONTACT_KEY, "MAIL");
        }
        uVar.m92258c2();
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public final void m92284r2(C35947l.C35949b bVar) {
        C31359a aVar = (C31359a) getActivity();
        if (aVar != null) {
            aVar.mo55692F(bVar);
        }
    }

    /* renamed from: s2 */
    private final void m92286s2(boolean z, String str, String str2) {
        String str3 = null;
        if (z) {
            C30941e.C30942a aVar = C30941e.f77070H;
            String str4 = this.f77117o;
            if (str4 == null) {
                C41536l.m120506z("contactId");
            } else {
                str3 = str4;
            }
            C30941e a = aVar.mo71159a(str3, str, str2, this);
            C1505h activity = getActivity();
            if (activity != null) {
                a.mo4576A1(((C0218d) activity).getSupportFragmentManager(), "otpview");
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        }
        C12902d.C12903a aVar2 = C12902d.f38098b;
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C12902d e = C12902d.C12903a.m48771e(aVar2, requireActivity, false, 2, (Object) null);
        String string = getString(C10220y.edit_main_mail_info_text);
        C41536l.m120488h(string, "getString(R.string.edit_main_mail_info_text)");
        e.mo33652k(string, C15278a.INFO, C12902d.C12905b.C12906a.f38103a);
        m92272l2().mo72127Nw();
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public final void m92288t2(C31705i.C31708b bVar) {
        m92248U2(bVar.mo72142a(), bVar.mo72143b());
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public final void m92290u2(C31551a aVar, int i) {
        m92237O2(this, C41341q.m119910m(C30972d.FAVORITE, C30972d.DELETE), (String) null, new C30954j(this, aVar), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public static final void m92292v2(C30965u uVar, C31551a aVar, C30972d dVar) {
        C41536l.m120489i(uVar, "this$0");
        C41536l.m120489i(aVar, "$info");
        C41536l.m120489i(dVar, "it");
        int i = C30974e.f77126a[dVar.ordinal()];
        if (i == 3) {
            uVar.m92213B2(aVar);
        } else if (i == 4) {
            uVar.m92278o2(aVar, true, TMXFlags.TMX_FLAG_FIN_PHONE_KEY, "PHONE");
        }
        uVar.m92258c2();
    }

    /* renamed from: w2 */
    private final void m92293w2() {
        List m = C41341q.m119910m(C30972d.CHANGE_PICTURE_CHOOSE_FROM_GALLERY, C30972d.CHANGE_PICTURE_TAKE_PHOTO, C30972d.DELETE);
        String string = getString(C10220y.change_picture);
        C41536l.m120488h(string, "getString(R.string.change_picture)");
        m92234M2(m, string, new C30953i(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public static final void m92295x2(C30965u uVar, C30972d dVar) {
        C41536l.m120489i(uVar, "this$0");
        C41536l.m120489i(dVar, "it");
        int i = C30974e.f77126a[dVar.ordinal()];
        if (i == 1) {
            uVar.m92250V2();
        } else if (i == 2) {
            uVar.m92257b2();
        } else if (i == 3) {
            uVar.m92272l2().mo72130Rw();
        }
        uVar.f77106d = dVar;
        uVar.m92258c2();
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public final void m92296y0(Enum enumR) {
        C30966a aVar;
        if ((enumR instanceof C30972d) && (aVar = this.f77111i) != null) {
            aVar.mo71166a((C30972d) enumR);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public final void m92298y2() {
        C1533o.m5445b(this, "EditProfileFragment.REQUEST_TAG_EDIT_PROFILE_PICTURE_UPDATED", C0908e.m3336b(C41233s.m119492a("EditProfileFragment.RESULT_TAG_EDIT_PROFILE_PICTURE_UPDATED", Boolean.TRUE)));
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public final void m92300z2(C35947l.C35949b bVar) {
        m92284r2(bVar);
        m92242R2(bVar.mo88517a().getMessage());
    }

    /* renamed from: J0 */
    public void mo71160J0() {
        m92272l2().mo72127Nw();
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        C43080q qVar = this.f77115m;
        if (qVar != null) {
            qVar.invoke(str, str2, str3);
        }
        m92259d2();
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        m92284r2(new C35947l.C35949b(new Exception(str)));
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        ContentResolver contentResolver;
        Uri data2;
        super.onActivityResult(i, i2, intent);
        if (i == 287) {
            m92274m2(i2);
        } else if (!(i != 303 || intent == null || (data2 = intent.getData()) == null)) {
            CropImageActivity.C24696a d = new CropImageActivity.C24696a().mo63102c(data2).mo63101b(1, 1).mo63103d(true);
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            d.mo63104e(requireContext, this);
        }
        if (i == 1001 && i2 == -1) {
            C31705i l2 = m92272l2();
            if (intent != null && (data = intent.getData()) != null) {
                Context context = getContext();
                if (context != null) {
                    contentResolver = context.getContentResolver();
                } else {
                    contentResolver = null;
                }
                if (contentResolver != null) {
                    l2.mo72133Xw(data, contentResolver);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m92249V1();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C28684u d = C28684u.m87853d(layoutInflater, viewGroup, false);
        C41536l.m120488h(d, "inflate(inflater, container, false)");
        ConstraintLayout constraintLayout = d.f72965N;
        C41536l.m120488h(constraintLayout, "binding.root");
        return constraintLayout;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f77108f = null;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2;
        C41536l.m120489i(strArr, "permissions");
        C41536l.m120489i(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 319) {
            C30972d dVar = this.f77106d;
            if (dVar == null) {
                i2 = -1;
            } else {
                i2 = C30974e.f77126a[dVar.ordinal()];
            }
            if (i2 == 1) {
                m92250V2();
            } else if (i2 == 2) {
                m92257b2();
            }
            this.f77106d = null;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        C28684u a = C28684u.m87852a(view);
        C41536l.m120488h(a, "bind(view)");
        this.f77108f = a;
        m92251W1();
        m92227J1(a);
        m92215C2(a);
        m92230K2(a);
        m92232L2(a);
        m92224H2(a);
        m92272l2().mo72127Nw();
        Group group = a.f72977h;
        if (C41536l.m120484d(m92262g2(), "JUNIOR")) {
            i = 8;
        } else {
            i = 0;
        }
        group.setVisibility(i);
    }
}
