package com.salesforce.marketingcloud.storage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.util.C11808c;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.security.GeneralSecurityException;
import java.util.Locale;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.storage.c */
public interface C11751c {

    /* renamed from: a */
    public static final String f34081a = "mcsdk_custprefs_%s";

    /* renamed from: b */
    public static final String f34082b = "et_attributes_cache";

    /* renamed from: c */
    public static final String f34083c = "et_tags_cache";

    /* renamed from: d */
    public static final String f34084d = "et_subscriber_cache";

    /* renamed from: e */
    public static final String f34085e = "gcm_reg_id_key";

    /* renamed from: f */
    public static final String f34086f = "et_session_id_cache";

    /* renamed from: g */
    public static final String f34087g = "et_user_id_cache";

    /* renamed from: h */
    public static final String f34088h = "mc_last_sent_registration";

    /* renamed from: i */
    public static final String f34089i = "sender_id";

    /* renamed from: j */
    public static final String f34090j = "subscriber_jwt";

    /* renamed from: k */
    public static final String f34091k = "predictive_intelligence_identifier";

    /* renamed from: com.salesforce.marketingcloud.storage.c$a */
    public static class C11752a implements C11751c {

        /* renamed from: l */
        private final SharedPreferences f34092l;

        /* renamed from: m */
        private final C11808c f34093m;

        C11752a(Context context, C11808c cVar, String str) {
            this.f34092l = context.getSharedPreferences(m42858b(str), 0);
            this.f34093m = cVar;
            m42859b();
        }

        /* renamed from: b */
        static String m42858b(String str) {
            return String.format(Locale.ENGLISH, C11751c.f34081a, new Object[]{str});
        }

        /* renamed from: c */
        private String m42860c(String str, String str2) {
            String str3 = null;
            String string = this.f34092l.getString(str, (String) null);
            if (string != null) {
                try {
                    str3 = this.f34093m.mo31644a(string);
                } catch (Exception e) {
                    C11461g.m41895e(C11788e.f34211c, e, "Failed to encrypt %s", str);
                }
            }
            return str3 == null ? str2 : str3;
        }

        /* renamed from: d */
        private void m42861d(String str, String str2) {
            this.f34092l.edit().putString(str, this.f34093m.mo31645b(str2)).apply();
        }

        /* renamed from: a */
        public final void mo31109a() {
            this.f34092l.edit().clear().apply();
        }

        /* renamed from: a */
        public final void mo31110a(String str) {
            this.f34092l.edit().remove(str).apply();
        }

        /* renamed from: b */
        public final String mo31112b(String str, String str2) {
            return m42860c(str, str2);
        }

        /* renamed from: b */
        private void m42859b() {
            if (this.f34092l.contains("gcm_sender_id")) {
                this.f34092l.edit().remove("gcm_sender_id").apply();
            }
        }

        /* renamed from: a */
        public final void mo31111a(String str, String str2) {
            try {
                m42861d(str, str2);
            } catch (UnsupportedEncodingException | GeneralSecurityException e) {
                C11461g.m41894e(C11788e.f34211c, String.format(Locale.ENGLISH, "Value for key %s not stored.", new Object[]{str}), e);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.salesforce.marketingcloud.storage.c$b */
    public @interface C11753b {
    }

    /* renamed from: a */
    void mo31109a();

    /* renamed from: a */
    void mo31110a(String str);

    /* renamed from: a */
    void mo31111a(String str, String str2);

    /* renamed from: b */
    String mo31112b(String str, String str2);
}
