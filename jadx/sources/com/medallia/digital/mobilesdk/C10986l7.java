package com.medallia.digital.mobilesdk;

import android.content.DialogInterface;
import androidx.appcompat.app.C0214c;
import com.medallia.digital.mobilesdk.C11089s6;

/* renamed from: com.medallia.digital.mobilesdk.l7 */
class C10986l7 {

    /* renamed from: a */
    private static C10986l7 f31550a;

    /* renamed from: com.medallia.digital.mobilesdk.l7$a */
    static /* synthetic */ class C10987a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31551a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.medallia.digital.mobilesdk.MDAppearanceMode[] r0 = com.medallia.digital.mobilesdk.MDAppearanceMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31551a = r0
                com.medallia.digital.mobilesdk.MDAppearanceMode r1 = com.medallia.digital.mobilesdk.MDAppearanceMode.dark     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31551a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.medallia.digital.mobilesdk.MDAppearanceMode r1 = com.medallia.digital.mobilesdk.MDAppearanceMode.light     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C10986l7.C10987a.<clinit>():void");
        }
    }

    protected C10986l7() {
    }

    /* renamed from: c */
    public static C10986l7 m40219c() {
        if (f31550a == null) {
            f31550a = new C10986l7();
        }
        return f31550a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo28701a(MDAppearanceMode mDAppearanceMode, MDAppearanceMode mDAppearanceMode2) {
        if (mDAppearanceMode != null && mDAppearanceMode != MDAppearanceMode.unknown) {
            int i = C10987a.f31551a[mDAppearanceMode.ordinal()];
            if (i == 1) {
                return C10706R.style.MedalliaInvitationDarkDialog;
            }
            if (i == 2) {
                return C10706R.style.MedalliaInvitationLightDialog;
            }
        } else if (mDAppearanceMode2 != null) {
            int i2 = C10987a.f31551a[mDAppearanceMode2.ordinal()];
            if (i2 == 1) {
                return C10706R.style.MedalliaInvitationDarkDialog;
            }
            if (i2 == 2) {
                return C10706R.style.MedalliaInvitationLightDialog;
            }
        }
        return C10706R.style.MedalliaInvitationLightDialog;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public MDAppearanceMode mo28706b() {
        String a = C11089s6.m40668b().mo28975a(C11089s6.C11090a.CUSTOM_APPEARANCE, (String) null);
        if (a != null) {
            try {
                if (!a.isEmpty()) {
                    int i = C10987a.f31551a[MDAppearanceMode.fromString(a).ordinal()];
                    if (i == 1) {
                        return MDAppearanceMode.dark;
                    }
                    if (i == 2) {
                        return MDAppearanceMode.light;
                    }
                }
            } catch (Exception e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
        return MDAppearanceMode.unknown;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public MDAppearanceMode mo28709d() {
        int i = C10884i4.m39721c().mo28483b().getResources().getConfiguration().uiMode & 48;
        if (i == 16) {
            C10735b4.m39109b("OS Appearance is: Light");
            return MDAppearanceMode.light;
        } else if (i != 32) {
            return MDAppearanceMode.light;
        } else {
            C10735b4.m39109b("OS Appearance is: Dark");
            return MDAppearanceMode.dark;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo28710e() {
        int i = C10884i4.m39721c().mo28483b().getResources().getConfiguration().uiMode & 48;
        if (i == 16) {
            C10735b4.m39109b("OS Appearance is: Light");
            C11089s6.m40668b().mo28984b(C11089s6.C11090a.OS_APPEARANCE, MDAppearanceMode.light.toString());
        } else if (i != 32) {
            return;
        }
        C10735b4.m39109b("OS Appearance is: Dark");
        C11089s6.m40668b().mo28984b(C11089s6.C11090a.OS_APPEARANCE, MDAppearanceMode.dark.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0214c.C0215a mo28702a(boolean z, String str, String str2, String str3, String str4, String str5, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3, DialogInterface.OnCancelListener onCancelListener, boolean z2, MDAppearanceMode mDAppearanceMode) {
        MDAppearanceMode mDAppearanceMode2;
        MDAppearanceMode mDAppearanceMode3 = mDAppearanceMode;
        int i = C10706R.style.MedalliaInvitationLightDialog;
        if (!z2 || mDAppearanceMode3 == null) {
            if (z) {
                mDAppearanceMode3 = mo28706b();
                mDAppearanceMode2 = mo28709d();
            }
            return new C10755c0(C10884i4.m39721c().mo28484d(), i, str, str2, str3, str4, str5, onClickListener, onClickListener2, onClickListener3, onCancelListener);
        }
        mDAppearanceMode2 = null;
        i = mo28701a(mDAppearanceMode3, mDAppearanceMode2);
        return new C10755c0(C10884i4.m39721c().mo28484d(), i, str, str2, str3, str4, str5, onClickListener, onClickListener2, onClickListener3, onCancelListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C10919j7 mo28707b(String str) {
        if (C11208y0.m41106c().mo29204a().getPropertyConfiguration() == null || C11208y0.m41106c().mo29204a().getPropertyConfiguration().getThemes() == null) {
            return null;
        }
        return C11208y0.m41106c().mo29204a().getPropertyConfiguration().getThemes().get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MDAppearanceMode mo28703a() {
        try {
            return (mo28706b() == MDAppearanceMode.unknown || mo28706b() == mo28709d()) ? mo28709d() : mo28706b();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return MDAppearanceMode.light;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28708b(MDAppearanceMode mDAppearanceMode) {
        if (mDAppearanceMode == null) {
            C11089s6.m40668b().mo28984b(C11089s6.C11090a.CUSTOM_APPEARANCE, MDAppearanceMode.unknown.toString());
        } else {
            C11089s6.m40668b().mo28984b(C11089s6.C11090a.CUSTOM_APPEARANCE, mDAppearanceMode.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10984l5 mo28704a(String str) {
        try {
            C10919j7 b = mo28707b(str);
            if (b == null) {
                return null;
            }
            int i = C10987a.f31551a[mo28703a().ordinal()];
            if (i == 1) {
                return b.mo28548a().mo28636a().mo28760a();
            }
            if (i != 2) {
                return null;
            }
            return b.mo28548a().mo28637b().mo28760a();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28705a(MDAppearanceMode mDAppearanceMode) {
        MDAppearanceMode b = mo28706b();
        if (mDAppearanceMode == null || b == null) {
            return false;
        }
        return !mDAppearanceMode.toString().equals(b.toString());
    }
}
