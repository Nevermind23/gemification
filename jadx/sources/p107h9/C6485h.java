package p107h9;

import android.util.Base64;
import android.util.JsonReader;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import p094g9.C6258a;
import p094g9.C6285b0;
import p094g9.C6331c0;
import p237r9.C8070a;
import p263t9.C8425d;

/* renamed from: h9.h */
public class C6485h {

    /* renamed from: a */
    private static final C8070a f19803a = new C8425d().mo23598j(C6258a.f19286a).mo23599k(true).mo23597i();

    /* renamed from: h9.h$a */
    private interface C6486a {
        /* renamed from: a */
        Object mo20387a(JsonReader jsonReader);
    }

    /* renamed from: A */
    private static C6285b0.C6293d m25611A(JsonReader jsonReader) {
        C6285b0.C6293d.C6294a a = C6285b0.C6293d.m24993a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("files")) {
                a.mo19993b(m25625l(jsonReader, new C6479b()));
            } else if (!nextName.equals("orgId")) {
                jsonReader.skipValue();
            } else {
                a.mo19994c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo19992a();
    }

    /* renamed from: B */
    private static C6285b0.C6297e.C6324e m25612B(JsonReader jsonReader) {
        C6285b0.C6297e.C6324e.C6325a a = C6285b0.C6297e.C6324e.m25177a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 0;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals(C11772k.C11773a.f34170b)) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo20164b(jsonReader.nextString());
                    break;
                case 1:
                    a.mo20165c(jsonReader.nextBoolean());
                    break;
                case 2:
                    a.mo20167e(jsonReader.nextString());
                    break;
                case 3:
                    a.mo20166d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo20163a();
    }

    /* renamed from: C */
    private static C6285b0 m25613C(JsonReader jsonReader) {
        C6285b0.C6290b b = C6285b0.m24934b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 2;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 3;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 4;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals(C11772k.C11773a.f34170b)) {
                        c = 6;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    b.mo19951g(m25611A(jsonReader));
                    break;
                case 1:
                    b.mo19953i(jsonReader.nextString());
                    break;
                case 2:
                    b.mo19946b(m25624k(jsonReader));
                    break;
                case 3:
                    b.mo19947c(jsonReader.nextString());
                    break;
                case 4:
                    b.mo19949e(jsonReader.nextString());
                    break;
                case 5:
                    b.mo19950f(jsonReader.nextString());
                    break;
                case 6:
                    b.mo19952h(jsonReader.nextInt());
                    break;
                case 7:
                    b.mo19948d(jsonReader.nextString());
                    break;
                case 8:
                    b.mo19954j(m25614D(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b.mo19945a();
    }

    /* renamed from: D */
    private static C6285b0.C6297e m25614D(JsonReader jsonReader) {
        C6285b0.C6297e.C6301b a = C6285b0.C6297e.m25005a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c = 5;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals("user")) {
                        c = 7;
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c = 9;
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c = 10;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo20040l(jsonReader.nextLong());
                    break;
                case 1:
                    a.mo20038j(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 2:
                    a.mo20033e(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 3:
                    a.mo20032d(m25628o(jsonReader));
                    break;
                case 4:
                    a.mo20034f(m25625l(jsonReader, new C6478a()));
                    break;
                case 5:
                    a.mo20039k(m25612B(jsonReader));
                    break;
                case 6:
                    a.mo20030b(m25623j(jsonReader));
                    break;
                case 7:
                    a.mo20041m(m25615E(jsonReader));
                    break;
                case 8:
                    a.mo20035g(jsonReader.nextString());
                    break;
                case 9:
                    a.mo20031c(jsonReader.nextBoolean());
                    break;
                case 10:
                    a.mo20036h(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo20029a();
    }

    /* renamed from: E */
    private static C6285b0.C6297e.C6326f m25615E(JsonReader jsonReader) {
        C6285b0.C6297e.C6326f.C6327a a = C6285b0.C6297e.C6326f.m25187a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("identifier")) {
                jsonReader.skipValue();
            } else {
                a.mo20170b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo20169a();
    }

    /* renamed from: j */
    private static C6285b0.C6297e.C6298a m25623j(JsonReader jsonReader) {
        C6285b0.C6297e.C6298a.C6299a a = C6285b0.C6297e.C6298a.m25021a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals("developmentPlatform")) {
                        c = 1;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals("developmentPlatformVersion")) {
                        c = 2;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo20026e(jsonReader.nextString());
                    break;
                case 1:
                    a.mo20023b(jsonReader.nextString());
                    break;
                case 2:
                    a.mo20024c(jsonReader.nextString());
                    break;
                case 3:
                    a.mo20028g(jsonReader.nextString());
                    break;
                case 4:
                    a.mo20027f(jsonReader.nextString());
                    break;
                case 5:
                    a.mo20025d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo20022a();
    }

    /* renamed from: k */
    private static C6285b0.C6286a m25624k(JsonReader jsonReader) {
        C6285b0.C6286a.C6289b a = C6285b0.C6286a.m24949a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals("pid")) {
                        c = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo19976b(m25625l(jsonReader, new C6481d()));
                    break;
                case 1:
                    a.mo19978d(jsonReader.nextInt());
                    break;
                case 2:
                    a.mo19980f(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo19982h(jsonReader.nextLong());
                    break;
                case 4:
                    a.mo19983i(jsonReader.nextLong());
                    break;
                case 5:
                    a.mo19979e(jsonReader.nextString());
                    break;
                case 6:
                    a.mo19981g(jsonReader.nextInt());
                    break;
                case 7:
                    a.mo19984j(jsonReader.nextString());
                    break;
                case 8:
                    a.mo19977c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo19975a();
    }

    /* renamed from: l */
    private static C6331c0 m25625l(JsonReader jsonReader, C6486a aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.mo20387a(jsonReader));
        }
        jsonReader.endArray();
        return C6331c0.m25210b(arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static C6285b0.C6286a.C6287a m25626m(JsonReader jsonReader) {
        C6285b0.C6286a.C6287a.C6288a a = C6285b0.C6286a.C6287a.m24959a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -609862170:
                    if (nextName.equals("libraryName")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c = 1;
                        break;
                    }
                    break;
                case 230943785:
                    if (nextName.equals("buildId")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo19974d(jsonReader.nextString());
                    break;
                case 1:
                    a.mo19972b(jsonReader.nextString());
                    break;
                case 2:
                    a.mo19973c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo19971a();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static C6285b0.C6291c m25627n(JsonReader jsonReader) {
        C6285b0.C6291c.C6292a a = C6285b0.C6291c.m24987a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("key")) {
                a.mo19988b(jsonReader.nextString());
            } else if (!nextName.equals(C11755a.C11756a.f34100b)) {
                jsonReader.skipValue();
            } else {
                a.mo19989c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo19987a();
    }

    /* renamed from: o */
    private static C6285b0.C6297e.C6302c m25628o(JsonReader jsonReader) {
        C6285b0.C6297e.C6302c.C6303a a = C6285b0.C6297e.C6302c.m25049a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals("manufacturer")) {
                        c = 1;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c = 3;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c = 5;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals("model")) {
                        c = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo20059i(jsonReader.nextBoolean());
                    break;
                case 1:
                    a.mo20055e(jsonReader.nextString());
                    break;
                case 2:
                    a.mo20058h(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo20052b(jsonReader.nextInt());
                    break;
                case 4:
                    a.mo20054d(jsonReader.nextLong());
                    break;
                case 5:
                    a.mo20053c(jsonReader.nextInt());
                    break;
                case 6:
                    a.mo20056f(jsonReader.nextString());
                    break;
                case 7:
                    a.mo20060j(jsonReader.nextInt());
                    break;
                case 8:
                    a.mo20057g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo20051a();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static C6285b0.C6297e.C6304d m25629p(JsonReader jsonReader) {
        C6285b0.C6297e.C6304d.C6319b a = C6285b0.C6297e.C6304d.m25069a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 0;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo20139c(m25632s(jsonReader));
                    break;
                case 1:
                    a.mo20138b(m25630q(jsonReader));
                    break;
                case 2:
                    a.mo20140d(m25636w(jsonReader));
                    break;
                case 3:
                    a.mo20142f(jsonReader.nextString());
                    break;
                case 4:
                    a.mo20141e(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo20137a();
    }

    /* renamed from: q */
    private static C6285b0.C6297e.C6304d.C6305a m25630q(JsonReader jsonReader) {
        C6285b0.C6297e.C6304d.C6305a.C6306a a = C6285b0.C6297e.C6304d.C6305a.m25076a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1332194002:
                    if (nextName.equals("background")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c = 1;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
                        c = 2;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c = 3;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo20074b(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 1:
                    a.mo20076d(m25633t(jsonReader));
                    break;
                case 2:
                    a.mo20077e(m25625l(jsonReader, new C6480c()));
                    break;
                case 3:
                    a.mo20075c(m25625l(jsonReader, new C6480c()));
                    break;
                case 4:
                    a.mo20078f(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo20073a();
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static C6285b0.C6297e.C6304d.C6305a.C6307b.C6308a m25631r(JsonReader jsonReader) {
        C6285b0.C6297e.C6304d.C6305a.C6307b.C6308a.C6309a a = C6285b0.C6297e.C6304d.C6305a.C6307b.C6308a.m25095a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo20091c(jsonReader.nextString());
                    break;
                case 1:
                    a.mo20092d(jsonReader.nextLong());
                    break;
                case 2:
                    a.mo20094f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a.mo20090b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo20089a();
    }

    /* renamed from: s */
    private static C6285b0.C6297e.C6304d.C6320c m25632s(JsonReader jsonReader) {
        C6285b0.C6297e.C6304d.C6320c.C6321a a = C6285b0.C6297e.C6304d.C6320c.m25159a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c = 2;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c = 3;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo20150b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case 1:
                    a.mo20151c(jsonReader.nextInt());
                    break;
                case 2:
                    a.mo20153e(jsonReader.nextInt());
                    break;
                case 3:
                    a.mo20152d(jsonReader.nextLong());
                    break;
                case 4:
                    a.mo20155g(jsonReader.nextLong());
                    break;
                case 5:
                    a.mo20154f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo20149a();
    }

    /* renamed from: t */
    private static C6285b0.C6297e.C6304d.C6305a.C6307b m25633t(JsonReader jsonReader) {
        C6285b0.C6297e.C6304d.C6305a.C6307b.C6310b a = C6285b0.C6297e.C6304d.C6305a.C6307b.m25089a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c = 1;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals("exception")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo20096b(m25624k(jsonReader));
                    break;
                case 1:
                    a.mo20100f(m25625l(jsonReader, new C6482e()));
                    break;
                case 2:
                    a.mo20099e(m25637x(jsonReader));
                    break;
                case 3:
                    a.mo20097c(m25625l(jsonReader, new C6483f()));
                    break;
                case 4:
                    a.mo20098d(m25634u(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo20095a();
    }

    /* renamed from: u */
    private static C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c m25634u(JsonReader jsonReader) {
        C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c.C6312a a = C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c.m25113a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo20108c(m25625l(jsonReader, new C6484g()));
                    break;
                case 1:
                    a.mo20110e(jsonReader.nextString());
                    break;
                case 2:
                    a.mo20111f(jsonReader.nextString());
                    break;
                case 3:
                    a.mo20107b(m25634u(jsonReader));
                    break;
                case 4:
                    a.mo20109d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo20106a();
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e.C6317b m25635v(JsonReader jsonReader) {
        C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e.C6317b.C6318a a = C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e.C6317b.m25141a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo20134d(jsonReader.nextLong());
                    break;
                case 1:
                    a.mo20136f(jsonReader.nextString());
                    break;
                case 2:
                    a.mo20135e(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo20132b(jsonReader.nextString());
                    break;
                case 4:
                    a.mo20133c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo20131a();
    }

    /* renamed from: w */
    private static C6285b0.C6297e.C6304d.C6322d m25636w(JsonReader jsonReader) {
        C6285b0.C6297e.C6304d.C6322d.C6323a a = C6285b0.C6297e.C6304d.C6322d.m25173a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("content")) {
                jsonReader.skipValue();
            } else {
                a.mo20158b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo20157a();
    }

    /* renamed from: x */
    private static C6285b0.C6297e.C6304d.C6305a.C6307b.C6313d m25637x(JsonReader jsonReader) {
        C6285b0.C6297e.C6304d.C6305a.C6307b.C6313d.C6314a a = C6285b0.C6297e.C6304d.C6305a.C6307b.C6313d.m25125a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1147692044:
                    if (nextName.equals("address")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3059181:
                    if (nextName.equals("code")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo20116b(jsonReader.nextLong());
                    break;
                case 1:
                    a.mo20117c(jsonReader.nextString());
                    break;
                case 2:
                    a.mo20118d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo20115a();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e m25638y(JsonReader jsonReader) {
        C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e.C6316a a = C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e.m25133a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo20123b(m25625l(jsonReader, new C6484g()));
                    break;
                case 1:
                    a.mo20125d(jsonReader.nextString());
                    break;
                case 2:
                    a.mo20124c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo20122a();
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static C6285b0.C6293d.C6295b m25639z(JsonReader jsonReader) {
        C6285b0.C6293d.C6295b.C6296a a = C6285b0.C6293d.C6295b.m24999a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("filename")) {
                a.mo19999c(jsonReader.nextString());
            } else if (!nextName.equals("contents")) {
                jsonReader.skipValue();
            } else {
                a.mo19998b(Base64.decode(jsonReader.nextString(), 2));
            }
        }
        jsonReader.endObject();
        return a.mo19997a();
    }

    /* renamed from: F */
    public C6285b0 mo20388F(String str) {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            C6285b0 C = m25613C(jsonReader);
            jsonReader.close();
            return C;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: G */
    public String mo20389G(C6285b0 b0Var) {
        return f19803a.mo23244a(b0Var);
    }

    /* renamed from: h */
    public C6285b0.C6297e.C6304d mo20390h(String str) {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            C6285b0.C6297e.C6304d p = m25629p(jsonReader);
            jsonReader.close();
            return p;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: i */
    public String mo20391i(C6285b0.C6297e.C6304d dVar) {
        return f19803a.mo23244a(dVar);
    }
}
