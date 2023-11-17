package com.medallia.digital.mobilesdk;

import android.util.Pair;
import com.medallia.digital.mobilesdk.C11089s6;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.a1 */
class C10714a1 {

    /* renamed from: a */
    private static final Long f30619a = 604800000L;

    /* renamed from: com.medallia.digital.mobilesdk.a1$a */
    static class C10715a extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ boolean f30620a;

        /* renamed from: b */
        final /* synthetic */ String f30621b;

        C10715a(boolean z, String str) {
            this.f30620a = z;
            this.f30621b = str;
        }

        /* renamed from: a */
        public void mo27617a() {
            C10735b4.m39113e("Saving local configuration storage, timestamp, clear uuid = " + this.f30620a);
            long currentTimeMillis = System.currentTimeMillis();
            String format = String.format(Locale.US, "%s/%d", new Object[]{"configuration", Long.valueOf(currentTimeMillis)});
            C11089s6.m40668b().mo28983b(C11089s6.C11090a.LOCAL_CONFIGURATION_TIMESTAMP, currentTimeMillis);
            C10735b4.m39109b("Local configuration timestamp was updated to " + currentTimeMillis);
            C10930k2.m39971a(format, this.f30621b);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.a1$b */
    static class C10716b extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ String f30622a;

        C10716b(String str) {
            this.f30622a = str;
        }

        /* renamed from: a */
        public void mo27617a() {
            C10735b4.m39113e("Saving local *Property* configuration storage");
            long currentTimeMillis = System.currentTimeMillis();
            String format = String.format(Locale.US, "%s/%d", new Object[]{"configurationPropertyForLocale", Long.valueOf(currentTimeMillis)});
            C10735b4.m39109b("Local *Property* configuration timestamp was updated to " + currentTimeMillis);
            C10930k2.m39971a(format, this.f30622a);
        }
    }

    C10714a1() {
    }

    /* renamed from: a */
    protected static ConfigurationContract m39018a(File file) {
        PropertyConfigurationContract createPropertyConfiguration;
        if (file == null) {
            return null;
        }
        ConfigurationContract createConfiguration = ModelFactory.getInstance().createConfiguration(C10930k2.m39989e(file));
        File d = m39029d();
        if (!(d == null || !m39025a(d.getName(), file.getName()) || (createPropertyConfiguration = ModelFactory.getInstance().createPropertyConfiguration(C10930k2.m39989e(d))) == null)) {
            createConfiguration.propertyConfiguration = createPropertyConfiguration;
        }
        return createConfiguration;
    }

    /* renamed from: b */
    protected static Pair<String, Boolean> m39026b() {
        C10735b4.m39113e("Deleting local *Property* configuration storage");
        return C10930k2.m39970a("configurationPropertyForLocale");
    }

    /* renamed from: c */
    protected static File m39028c() {
        File d = C10930k2.m39984d("configuration");
        if (d == null || !d.isDirectory() || d.listFiles() == null || d.listFiles().length <= 0) {
            return null;
        }
        return d.listFiles()[0];
    }

    /* renamed from: d */
    protected static File m39029d() {
        File d = C10930k2.m39984d("configurationPropertyForLocale");
        if (d == null || !d.isDirectory() || d.listFiles() == null || d.listFiles().length <= 0) {
            return null;
        }
        return d.listFiles()[0];
    }

    /* renamed from: a */
    protected static List<Pair<String, Boolean>> m39019a() {
        return m39022a(true);
    }

    /* renamed from: b */
    protected static Pair<String, Boolean> m39027b(String str) {
        Pair<String, Boolean> b = m39026b();
        new Thread(new C10716b(str)).start();
        return b;
    }

    /* renamed from: a */
    protected static List<Pair<String, Boolean>> m39020a(String str) {
        return m39021a(str, true);
    }

    /* renamed from: a */
    protected static List<Pair<String, Boolean>> m39021a(String str, boolean z) {
        List<Pair<String, Boolean>> a = m39022a(z);
        new Thread(new C10715a(z, str)).start();
        return a;
    }

    /* renamed from: a */
    protected static List<Pair<String, Boolean>> m39022a(boolean z) {
        C10735b4.m39113e("Deleting local configuration storage, timestamp, delete uuid = " + z);
        if (z) {
            C11089s6.m40668b().mo28984b(C11089s6.C11090a.UUID, (String) null);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(m39026b());
        C11089s6.m40668b().mo28983b(C11089s6.C11090a.LOCAL_CONFIGURATION_TIMESTAMP, 0);
        arrayList.add(C10930k2.m39970a("configuration"));
        return arrayList;
    }

    /* renamed from: a */
    protected static boolean m39023a(ConfigurationContract configurationContract) {
        Long offlineConfigurationExpirationTime = configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().getOfflineConfigurationExpirationTime();
        if (offlineConfigurationExpirationTime == null) {
            offlineConfigurationExpirationTime = f30619a;
        }
        long currentTimeMillis = System.currentTimeMillis();
        return offlineConfigurationExpirationTime.longValue() < currentTimeMillis - C11089s6.m40668b().mo28974a(C11089s6.C11090a.LOCAL_CONFIGURATION_TIMESTAMP, currentTimeMillis);
    }

    /* renamed from: a */
    protected static boolean m39024a(File file, ConfigurationContract configurationContract) {
        return (configurationContract == null || file == null || configurationContract.getSdkConfiguration() == null || configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() == null) ? false : true;
    }

    /* renamed from: a */
    private static boolean m39025a(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        return Long.parseLong(str) > Long.parseLong(str2);
    }
}
