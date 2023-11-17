package p275u8;

import android.text.TextUtils;
import com.google.firebase.abt.AbtException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import p301w8.C8878a;

/* renamed from: u8.a */
public class C8647a {

    /* renamed from: g */
    private static final String[] f24430g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h */
    static final DateFormat f24431h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a */
    private final String f24432a;

    /* renamed from: b */
    private final String f24433b;

    /* renamed from: c */
    private final String f24434c;

    /* renamed from: d */
    private final Date f24435d;

    /* renamed from: e */
    private final long f24436e;

    /* renamed from: f */
    private final long f24437f;

    public C8647a(String str, String str2, String str3, Date date, long j, long j2) {
        this.f24432a = str;
        this.f24433b = str2;
        this.f24434c = str3;
        this.f24435d = date;
        this.f24436e = j;
        this.f24437f = j2;
    }

    /* renamed from: a */
    static C8647a m32250a(C8878a.C8881c cVar) {
        String str = cVar.f24875d;
        if (str == null) {
            str = "";
        }
        return new C8647a(cVar.f24873b, String.valueOf(cVar.f24874c), str, new Date(cVar.f24884m), cVar.f24876e, cVar.f24881j);
    }

    /* renamed from: b */
    static C8647a m32251b(Map map) {
        String str;
        m32252g(map);
        try {
            Date parse = f24431h.parse((String) map.get("experimentStartTime"));
            long parseLong = Long.parseLong((String) map.get("triggerTimeoutMillis"));
            long parseLong2 = Long.parseLong((String) map.get("timeToLiveMillis"));
            String str2 = (String) map.get("experimentId");
            String str3 = (String) map.get("variantId");
            if (map.containsKey("triggerEvent")) {
                str = (String) map.get("triggerEvent");
            } else {
                str = "";
            }
            return new C8647a(str2, str3, str, parse, parseLong, parseLong2);
        } catch (ParseException e) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e);
        } catch (NumberFormatException e2) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e2);
        }
    }

    /* renamed from: g */
    private static void m32252g(Map map) {
        ArrayList arrayList = new ArrayList();
        for (String str : f24430g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", new Object[]{arrayList}));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo23978c() {
        return this.f24432a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo23979d() {
        return this.f24435d.getTime();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo23980e() {
        return this.f24433b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C8878a.C8881c mo23981f(String str) {
        String str2;
        C8878a.C8881c cVar = new C8878a.C8881c();
        cVar.f24872a = str;
        cVar.f24884m = mo23979d();
        cVar.f24873b = this.f24432a;
        cVar.f24874c = this.f24433b;
        if (TextUtils.isEmpty(this.f24434c)) {
            str2 = null;
        } else {
            str2 = this.f24434c;
        }
        cVar.f24875d = str2;
        cVar.f24876e = this.f24436e;
        cVar.f24881j = this.f24437f;
        return cVar;
    }
}
