package com.medallia.digital.mobilesdk;

import java.io.Serializable;

/* renamed from: com.medallia.digital.mobilesdk.q */
class C11062q implements Serializable {

    /* renamed from: g */
    private static final int f31808g = 31;

    /* renamed from: a */
    private String f31809a;

    /* renamed from: b */
    private InviteData f31810b;

    /* renamed from: c */
    private String f31811c;

    /* renamed from: d */
    private String f31812d;

    /* renamed from: e */
    private boolean f31813e;

    /* renamed from: f */
    private boolean f31814f;

    C11062q(AppRatingContract appRatingContract) {
        this.f31809a = appRatingContract.getAppRatingId();
        this.f31810b = appRatingContract.getInviteData();
        this.f31811c = appRatingContract.getAppRatingUrl();
        this.f31812d = appRatingContract.getAppRatingLanguage();
        this.f31813e = appRatingContract.isDarkModeEnabled();
        this.f31814f = appRatingContract.isAppRatingDirectApi();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo28920a() {
        return this.f31809a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo28922b() {
        return this.f31812d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo28923c() {
        return this.f31811c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public InviteData mo28924d() {
        return this.f31810b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo28925e() {
        return this.f31814f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11062q qVar = (C11062q) obj;
        String str = this.f31809a;
        if (str == null ? qVar.f31809a != null : !str.equals(qVar.f31809a)) {
            return false;
        }
        InviteData inviteData = this.f31810b;
        if (inviteData == null ? qVar.f31810b != null : !inviteData.equals(qVar.f31810b)) {
            return false;
        }
        String str2 = this.f31812d;
        if (str2 == null ? qVar.f31812d != null : !str2.equals(qVar.f31812d)) {
            return false;
        }
        if (this.f31813e != qVar.f31813e) {
            return false;
        }
        String str3 = this.f31811c;
        String str4 = qVar.f31811c;
        return str3 != null ? str3.equals(str4) : str4 == null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo28927f() {
        return this.f31813e;
    }

    public int hashCode() {
        String str = this.f31809a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        InviteData inviteData = this.f31810b;
        int hashCode2 = (hashCode + (inviteData != null ? inviteData.hashCode() : 0)) * 31;
        String str2 = this.f31811c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f31812d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode3 + i) * 31) + Boolean.valueOf(this.f31813e).hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28921a(AppRatingContract appRatingContract) {
        if (appRatingContract != null) {
            this.f31809a = appRatingContract.getAppRatingId();
            this.f31810b = appRatingContract.getInviteData();
            this.f31811c = appRatingContract.getAppRatingUrl();
            this.f31812d = appRatingContract.getAppRatingLanguage();
            this.f31813e = appRatingContract.isDarkModeEnabled();
            this.f31814f = appRatingContract.isAppRatingDirectApi();
        }
    }
}
