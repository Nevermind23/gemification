package p402ed;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.C41536l;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ed.c */
public final class C12425c {

    /* renamed from: a */
    public static final C12425c f37092a = new C12425c();

    private C12425c() {
    }

    /* renamed from: a */
    public final String mo33031a() {
        int i = Build.VERSION.SDK_INT;
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.VERSION.RELEASE;
        String name = Build.VERSION_CODES.class.getFields()[i].getName();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("android_sdk_version", i);
            jSONObject.put("model", str);
            jSONObject.put("manufacturer", str2);
            jSONObject.put("release_code", str3);
            jSONObject.put("release_code_name", name);
            jSONObject.put(C11772k.C11773a.f34186r, "1.1.68");
            return URLEncoder.encode(jSONObject.toString(), StandardCharsets.UTF_8.toString());
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return null;
        } catch (Exception e3) {
            e3.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final void mo33032b(Context context) {
        C41536l.m120489i(context, "context");
        if (Build.VERSION.SDK_INT >= 26) {
            Object systemService = context.getSystemService("vibrator");
            if (systemService != null) {
                ((Vibrator) systemService).vibrate(VibrationEffect.createOneShot(150, -1));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
        }
        Object systemService2 = context.getSystemService("vibrator");
        if (systemService2 != null) {
            ((Vibrator) systemService2).vibrate(150);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
    }
}
