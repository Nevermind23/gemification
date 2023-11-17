package p159l9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;
import p027b9.C2184f;
import p068e9.C6063h;
import p133j9.C6762f;

/* renamed from: l9.a */
public class C7015a {

    /* renamed from: a */
    private final File f20896a;

    public C7015a(C6762f fVar) {
        this.f20896a = fVar.mo20793e("com.crashlytics.settings.json");
    }

    /* renamed from: a */
    private File m27165a() {
        return this.f20896a;
    }

    /* renamed from: b */
    public JSONObject mo21228b() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        C2184f.m8346f().mo7089b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File a = m27165a();
            if (a.exists()) {
                fileInputStream = new FileInputStream(a);
                try {
                    jSONObject = new JSONObject(C6063h.m24209D(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e) {
                    e = e;
                    try {
                        C2184f.m8346f().mo7092e("Failed to fetch cached settings", e);
                        C6063h.m24214e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        C6063h.m24214e(fileInputStream, "Error while closing settings cache file.");
                        throw th;
                    }
                }
            } else {
                C2184f.m8346f().mo7095i("Settings file does not exist.");
                jSONObject = null;
            }
            C6063h.m24214e(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            C2184f.m8346f().mo7092e("Failed to fetch cached settings", e);
            C6063h.m24214e(fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
            C6063h.m24214e(fileInputStream, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* renamed from: c */
    public void mo21229c(long j, JSONObject jSONObject) {
        C2184f.m8346f().mo7095i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                jSONObject.put("expires_at", j);
                FileWriter fileWriter2 = new FileWriter(m27165a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    C6063h.m24214e(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    try {
                        C2184f.m8346f().mo7092e("Failed to cache settings", e);
                        C6063h.m24214e(fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th) {
                        th = th;
                        C6063h.m24214e(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    C6063h.m24214e(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                C2184f.m8346f().mo7092e("Failed to cache settings", e);
                C6063h.m24214e(fileWriter, "Failed to close settings writer.");
            }
        }
    }
}
