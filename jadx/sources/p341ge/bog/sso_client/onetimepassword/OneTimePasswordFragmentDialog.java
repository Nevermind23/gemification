package p341ge.bog.sso_client.onetimepassword;

import ah1.C40314b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import dc1.C31559e;
import dc1.C31560f;
import he1.C41217g;
import he1.C41222k;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.UserContact;
import p349ah.C9860d;
import p670xi.C18765b;
import p670xi.C18767d;
import ua1.C28646h0;
import ue1.C43064a;
import yg1.C43399a;

/* renamed from: ge.bog.sso_client.onetimepassword.OneTimePasswordFragmentDialog */
public final class OneTimePasswordFragmentDialog extends C9860d implements C18765b {

    /* renamed from: F */
    public static final C36018a f87123F = new C36018a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C28646h0 f87124B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C31559e f87125C;

    /* renamed from: D */
    private final C41217g f87126D = C41219i.m119469a(C41222k.NONE, new C36022e(this, (C41806a) null, (C43064a) null, new C36021d(this), (C43064a) null));

    /* renamed from: E */
    private final C41217g f87127E = C41219i.m119470b(new C36020c(this));

    /* renamed from: ge.bog.sso_client.onetimepassword.OneTimePasswordFragmentDialog$Arguments */
    public static final class Arguments implements Parcelable {
        public static final Parcelable.Creator<Arguments> CREATOR = new C36017b();

        /* renamed from: g */
        public static final C36016a f87128g = new C36016a((DefaultConstructorMarker) null);

        /* renamed from: d */
        private final UserContact f87129d;

        /* renamed from: e */
        private final UserContact f87130e;

        /* renamed from: f */
        private final String f87131f;

        /* renamed from: ge.bog.sso_client.onetimepassword.OneTimePasswordFragmentDialog$Arguments$a */
        public static final class C36016a {
            private C36016a() {
            }

            public /* synthetic */ C36016a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: ge.bog.sso_client.onetimepassword.OneTimePasswordFragmentDialog$Arguments$b */
        public static final class C36017b implements Parcelable.Creator {
            /* renamed from: a */
            public final Arguments createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                UserContact userContact = null;
                UserContact createFromParcel = parcel.readInt() == 0 ? null : UserContact.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    userContact = UserContact.CREATOR.createFromParcel(parcel);
                }
                return new Arguments(createFromParcel, userContact, parcel.readString());
            }

            /* renamed from: b */
            public final Arguments[] newArray(int i) {
                return new Arguments[i];
            }
        }

        public Arguments(UserContact userContact, UserContact userContact2, String str) {
            this.f87129d = userContact;
            this.f87130e = userContact2;
            this.f87131f = str;
        }

        /* renamed from: a */
        public final String mo88728a() {
            return this.f87131f;
        }

        /* renamed from: b */
        public final UserContact mo88729b() {
            return this.f87130e;
        }

        /* renamed from: d */
        public final UserContact mo88730d() {
            return this.f87129d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Arguments)) {
                return false;
            }
            Arguments arguments = (Arguments) obj;
            return C41536l.m120484d(this.f87129d, arguments.f87129d) && C41536l.m120484d(this.f87130e, arguments.f87130e) && C41536l.m120484d(this.f87131f, arguments.f87131f);
        }

        public int hashCode() {
            UserContact userContact = this.f87129d;
            int i = 0;
            int hashCode = (userContact == null ? 0 : userContact.hashCode()) * 31;
            UserContact userContact2 = this.f87130e;
            int hashCode2 = (hashCode + (userContact2 == null ? 0 : userContact2.hashCode())) * 31;
            String str = this.f87131f;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "Arguments(smsContact=" + this.f87129d + ", emailContact=" + this.f87130e + ", clientKey=" + this.f87131f + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            UserContact userContact = this.f87129d;
            if (userContact == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                userContact.writeToParcel(parcel, i);
            }
            UserContact userContact2 = this.f87130e;
            if (userContact2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                userContact2.writeToParcel(parcel, i);
            }
            parcel.writeString(this.f87131f);
        }
    }

    /* renamed from: ge.bog.sso_client.onetimepassword.OneTimePasswordFragmentDialog$a */
    public static final class C36018a {
        private C36018a() {
        }

        public /* synthetic */ C36018a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final OneTimePasswordFragmentDialog mo88740a(C31559e eVar, UserContact userContact, UserContact userContact2, String str) {
            C41536l.m120489i(eVar, "oneTimePasswordResponseListener");
            OneTimePasswordFragmentDialog oneTimePasswordFragmentDialog = new OneTimePasswordFragmentDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("one_time_password_args", new Arguments(userContact, userContact2, str));
            oneTimePasswordFragmentDialog.setArguments(bundle);
            oneTimePasswordFragmentDialog.f87125C = eVar;
            return oneTimePasswordFragmentDialog;
        }
    }

    /* renamed from: ge.bog.sso_client.onetimepassword.OneTimePasswordFragmentDialog$b */
    public /* synthetic */ class C36019b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f87132a;

        static {
            int[] iArr = new int[C18767d.values().length];
            iArr[C18767d.PHONE.ordinal()] = 1;
            iArr[C18767d.EMAIL.ordinal()] = 2;
            f87132a = iArr;
        }
    }

    /* renamed from: ge.bog.sso_client.onetimepassword.OneTimePasswordFragmentDialog$c */
    static final class C36020c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OneTimePasswordFragmentDialog f87133d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36020c(OneTimePasswordFragmentDialog oneTimePasswordFragmentDialog) {
            super(0);
            this.f87133d = oneTimePasswordFragmentDialog;
        }

        /* renamed from: b */
        public final Arguments invoke() {
            Bundle arguments = this.f87133d.getArguments();
            if (arguments != null) {
                return (Arguments) arguments.getParcelable("one_time_password_args");
            }
            return null;
        }
    }

    /* renamed from: ge.bog.sso_client.onetimepassword.OneTimePasswordFragmentDialog$d */
    public static final class C36021d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f87134d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36021d(Fragment fragment) {
            super(0);
            this.f87134d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            Fragment fragment = this.f87134d;
            return aVar.mo102076a(fragment, fragment);
        }
    }

    /* renamed from: ge.bog.sso_client.onetimepassword.OneTimePasswordFragmentDialog$e */
    public static final class C36022e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f87135d;

        /* renamed from: e */
        final /* synthetic */ C41806a f87136e;

        /* renamed from: f */
        final /* synthetic */ C43064a f87137f;

        /* renamed from: g */
        final /* synthetic */ C43064a f87138g;

        /* renamed from: h */
        final /* synthetic */ C43064a f87139h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36022e(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f87135d = fragment;
            this.f87136e = aVar;
            this.f87137f = aVar2;
            this.f87138g = aVar3;
            this.f87139h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f87135d, this.f87136e, this.f87137f, this.f87138g, C41520a0.m120436b(C31560f.class), this.f87139h);
        }
    }

    /* renamed from: i2 */
    private final Arguments m107195i2() {
        return (Arguments) this.f87127E.getValue();
    }

    /* renamed from: j2 */
    private final C28646h0 m107196j2() {
        C28646h0 h0Var = this.f87124B;
        if (h0Var != null) {
            return h0Var;
        }
        C41536l.m120506z("_binding");
        return null;
    }

    /* renamed from: k2 */
    private final C31560f m107197k2() {
        return (C31560f) this.f87126D.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m107198l2(OneTimePasswordFragmentDialog oneTimePasswordFragmentDialog, View view) {
        C41536l.m120489i(oneTimePasswordFragmentDialog, "this$0");
        C28646h0 h0Var = oneTimePasswordFragmentDialog.f87124B;
        if (h0Var == null) {
            C41536l.m120506z("_binding");
            h0Var = null;
        }
        oneTimePasswordFragmentDialog.m107202p2(h0Var.f72750e.getOtpType());
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m107199m2(OneTimePasswordFragmentDialog oneTimePasswordFragmentDialog, View view) {
        boolean z;
        String str;
        C41536l.m120489i(oneTimePasswordFragmentDialog, "this$0");
        if (oneTimePasswordFragmentDialog.m107196j2().f72750e.getBinding().f27107e.getInputText().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            oneTimePasswordFragmentDialog.m107196j2().f72751f.setLoading(true);
            C31560f k2 = oneTimePasswordFragmentDialog.m107197k2();
            String inputText = oneTimePasswordFragmentDialog.m107196j2().f72750e.getBinding().f27107e.getInputText();
            Arguments i2 = oneTimePasswordFragmentDialog.m107195i2();
            if (i2 != null) {
                str = i2.mo88728a();
            } else {
                str = null;
            }
            if (str != null) {
                k2.mo71990iw(inputText, str);
                return;
            }
            throw new IllegalArgumentException("ClientKey not found".toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m107200n2(C35947l lVar) {
        boolean z = lVar instanceof C35947l.C35951d;
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m107201o2(OneTimePasswordFragmentDialog oneTimePasswordFragmentDialog, C35947l lVar) {
        C41536l.m120489i(oneTimePasswordFragmentDialog, "this$0");
        if (lVar instanceof C35947l.C35951d) {
            C31559e eVar = oneTimePasswordFragmentDialog.f87125C;
            if (eVar != null) {
                eVar.mo42323b0((String) ((C35947l.C35951d) lVar).mo88520a());
            }
            oneTimePasswordFragmentDialog.mo4577k1();
        } else if (lVar instanceof C35947l.C35949b) {
            oneTimePasswordFragmentDialog.m107196j2().f72750e.mo36272n();
            oneTimePasswordFragmentDialog.m107196j2().f72751f.setLoading(false);
        }
    }

    /* renamed from: p2 */
    private final void m107202p2(C18767d dVar) {
        int i = C36019b.f87132a[dVar.ordinal()];
        UserContact userContact = null;
        if (i == 1) {
            C31560f k2 = m107197k2();
            Arguments i2 = m107195i2();
            if (i2 != null) {
                userContact = i2.mo88730d();
            }
            if (userContact != null) {
                k2.mo71989hw(userContact);
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (i == 2) {
            C31560f k22 = m107197k2();
            Arguments i22 = m107195i2();
            if (i22 != null) {
                userContact = i22.mo88729b();
            }
            if (userContact != null) {
                k22.mo71989hw(userContact);
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        C28646h0 d = C28646h0.m87689d(layoutInflater, viewGroup, true);
        C41536l.m120488h(d, "inflate(inflater, container, true)");
        this.f87124B = d;
        if (d == null) {
            C41536l.m120506z("_binding");
            d = null;
        }
        d.f72750e.setOneTimePasswordListener(this);
    }

    /* renamed from: n */
    public void mo46551n() {
        m107202p2(m107196j2().f72750e.getOtpType());
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [ge.bog.sso_client.models.UserContact] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C41536l.m120489i(r6, r0)
            super.onViewCreated(r6, r7)
            int r6 = ba1.C10220y.sso_one_time_password_title
            java.lang.String r6 = r5.getString(r6)
            r5.mo26370a2(r6)
            ua1.h0 r6 = r5.f87124B
            java.lang.String r7 = "_binding"
            r0 = 0
            if (r6 != 0) goto L_0x001c
            kotlin.jvm.internal.C41536l.m120506z(r7)
            r6 = r0
        L_0x001c:
            ge.bog.designsystem.components.onetimepassword.OneTimePasswordView r6 = r6.f72750e
            dc1.a r1 = new dc1.a
            r1.<init>(r5)
            r6.setResendButtonClickListener(r1)
            ua1.h0 r6 = r5.m107196j2()
            ge.bog.designsystem.components.buttons.Button r6 = r6.f72751f
            dc1.b r1 = new dc1.b
            r1.<init>(r5)
            r6.setOnClickListener(r1)
            dc1.f r6 = r5.m107197k2()
            androidx.lifecycle.LiveData r6 = r6.mo71987fw()
            androidx.lifecycle.q r1 = r5.getViewLifecycleOwner()
            dc1.c r2 = new dc1.c
            r2.<init>()
            r6.mo4819k(r1, r2)
            dc1.f r6 = r5.m107197k2()
            androidx.lifecycle.LiveData r6 = r6.mo71988gw()
            androidx.lifecycle.q r1 = r5.getViewLifecycleOwner()
            dc1.d r2 = new dc1.d
            r2.<init>(r5)
            r6.mo4819k(r1, r2)
            androidx.fragment.app.h r6 = r5.requireActivity()
            boolean r1 = r6 instanceof ha1.C15454a
            if (r1 == 0) goto L_0x0067
            ha1.a r6 = (ha1.C15454a) r6
            goto L_0x0068
        L_0x0067:
            r6 = r0
        L_0x0068:
            r1 = 0
            if (r6 == 0) goto L_0x0086
            r2 = 2
            androidx.lifecycle.LiveData[] r2 = new androidx.lifecycle.LiveData[r2]
            dc1.f r3 = r5.m107197k2()
            androidx.lifecycle.LiveData r3 = r3.mo71987fw()
            r2[r1] = r3
            dc1.f r3 = r5.m107197k2()
            androidx.lifecycle.LiveData r3 = r3.mo71988gw()
            r4 = 1
            r2[r4] = r3
            r6.mo42539S0(r2)
        L_0x0086:
            ge.bog.sso_client.onetimepassword.OneTimePasswordFragmentDialog$Arguments r6 = r5.m107195i2()
            if (r6 == 0) goto L_0x0091
            ge.bog.sso_client.models.UserContact r6 = r6.mo88730d()
            goto L_0x0092
        L_0x0091:
            r6 = r0
        L_0x0092:
            if (r6 != 0) goto L_0x00b2
            ge.bog.sso_client.onetimepassword.OneTimePasswordFragmentDialog$Arguments r6 = r5.m107195i2()
            if (r6 == 0) goto L_0x009f
            ge.bog.sso_client.models.UserContact r6 = r6.mo88729b()
            goto L_0x00a0
        L_0x009f:
            r6 = r0
        L_0x00a0:
            if (r6 != 0) goto L_0x00b2
            ua1.h0 r6 = r5.f87124B
            if (r6 != 0) goto L_0x00aa
            kotlin.jvm.internal.C41536l.m120506z(r7)
            goto L_0x00ab
        L_0x00aa:
            r0 = r6
        L_0x00ab:
            ge.bog.designsystem.components.onetimepassword.OneTimePasswordView r6 = r0.f72750e
            r6.mo36277s()
            goto L_0x0125
        L_0x00b2:
            ge.bog.sso_client.onetimepassword.OneTimePasswordFragmentDialog$Arguments r6 = r5.m107195i2()
            if (r6 == 0) goto L_0x00bd
            ge.bog.sso_client.models.UserContact r6 = r6.mo88730d()
            goto L_0x00be
        L_0x00bd:
            r6 = r0
        L_0x00be:
            java.lang.String r7 = ""
            if (r6 != 0) goto L_0x00d1
            ua1.h0 r6 = r5.m107196j2()
            ge.bog.designsystem.components.onetimepassword.OneTimePasswordView r6 = r6.f72750e
            r6.setPhoneEnabled(r1)
            xi.d r6 = p670xi.C18767d.EMAIL
            r5.m107202p2(r6)
            goto L_0x00f2
        L_0x00d1:
            ua1.h0 r6 = r5.m107196j2()
            ge.bog.designsystem.components.onetimepassword.OneTimePasswordView r6 = r6.f72750e
            ge.bog.sso_client.onetimepassword.OneTimePasswordFragmentDialog$Arguments r2 = r5.m107195i2()
            if (r2 == 0) goto L_0x00e9
            ge.bog.sso_client.models.UserContact r2 = r2.mo88730d()
            if (r2 == 0) goto L_0x00e9
            java.lang.String r2 = r2.mo88418a()
            if (r2 != 0) goto L_0x00ea
        L_0x00e9:
            r2 = r7
        L_0x00ea:
            r6.setPhoneNumber(r2)
            xi.d r6 = p670xi.C18767d.PHONE
            r5.m107202p2(r6)
        L_0x00f2:
            ge.bog.sso_client.onetimepassword.OneTimePasswordFragmentDialog$Arguments r6 = r5.m107195i2()
            if (r6 == 0) goto L_0x00fc
            ge.bog.sso_client.models.UserContact r0 = r6.mo88729b()
        L_0x00fc:
            if (r0 != 0) goto L_0x0108
            ua1.h0 r6 = r5.m107196j2()
            ge.bog.designsystem.components.onetimepassword.OneTimePasswordView r6 = r6.f72750e
            r6.setEmailEnabled(r1)
            goto L_0x0125
        L_0x0108:
            ua1.h0 r6 = r5.m107196j2()
            ge.bog.designsystem.components.onetimepassword.OneTimePasswordView r6 = r6.f72750e
            ge.bog.sso_client.onetimepassword.OneTimePasswordFragmentDialog$Arguments r0 = r5.m107195i2()
            if (r0 == 0) goto L_0x0122
            ge.bog.sso_client.models.UserContact r0 = r0.mo88729b()
            if (r0 == 0) goto L_0x0122
            java.lang.String r0 = r0.mo88418a()
            if (r0 != 0) goto L_0x0121
            goto L_0x0122
        L_0x0121:
            r7 = r0
        L_0x0122:
            r6.setEmail(r7)
        L_0x0125:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.sso_client.onetimepassword.OneTimePasswordFragmentDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
