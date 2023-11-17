package p011aa;

import com.google.firebase.C5270e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aa.c */
public class C0093c {

    /* renamed from: a */
    private File f919a;

    /* renamed from: b */
    private final C5270e f920b;

    /* renamed from: aa.c$a */
    public enum C0094a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C0093c(C5270e eVar) {
        this.f920b = eVar;
    }

    /* renamed from: a */
    private File m258a() {
        if (this.f919a == null) {
            synchronized (this) {
                if (this.f919a == null) {
                    File filesDir = this.f920b.mo17481j().getFilesDir();
                    this.f919a = new File(filesDir, "PersistedInstallation." + this.f920b.mo17484o() + ".json");
                }
            }
        }
        return this.f919a;
    }

    /* renamed from: c */
    private JSONObject m259c() {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(m258a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: b */
    public C0095d mo151b(C0095d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.mo132d());
            jSONObject.put("Status", dVar.mo136g().ordinal());
            jSONObject.put("AuthToken", dVar.mo130b());
            jSONObject.put("RefreshToken", dVar.mo135f());
            jSONObject.put("TokenCreationEpochInSecs", dVar.mo137h());
            jSONObject.put("ExpiresInSecs", dVar.mo131c());
            jSONObject.put("FisError", dVar.mo133e());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f920b.mo17481j().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(m258a())) {
                return dVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    /* renamed from: d */
    public C0095d mo152d() {
        JSONObject c = m259c();
        String optString = c.optString("Fid", (String) null);
        int optInt = c.optInt("Status", C0094a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = c.optString("AuthToken", (String) null);
        String optString3 = c.optString("RefreshToken", (String) null);
        long optLong = c.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = c.optLong("ExpiresInSecs", 0);
        return C0095d.m262a().mo144d(optString).mo147g(C0094a.values()[optInt]).mo142b(optString2).mo146f(optString3).mo148h(optLong).mo143c(optLong2).mo145e(c.optString("FisError", (String) null)).mo141a();
    }
}
