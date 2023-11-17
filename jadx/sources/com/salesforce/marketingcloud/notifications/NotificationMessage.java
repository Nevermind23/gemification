package com.salesforce.marketingcloud.notifications;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.messages.Region;
import he1.C41224m;
import he1.C41233s;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@MCKeep
public final class NotificationMessage implements Parcelable {
    public static final Parcelable.Creator<NotificationMessage> CREATOR = new C11694b();
    public static final C11693a Companion = new C11693a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String[] KNOWN_KEYS = {NOTIF_KEY_ID, NOTIF_KEY_SID, "timestamp", NOTIF_KEY_MESSAGE_TYPE, NOTIF_KEY_MESSAGE_HASH, NOTIF_KEY_REQUEST_ID, "title", NOTIF_KEY_SUB_TITLE, "alert", "sound", NOTIF_KEY_MEDIA_URL, NOTIF_KEY_MEDIA_ALT, NOTIF_KEY_CLOUD_PAGE_URL, NOTIF_KEY_OPEN_DIRECT_URL};
    public static final String NOTIF_KEY_ALERT = "alert";
    public static final String NOTIF_KEY_CLOUD_PAGE_URL = "_x";
    public static final String NOTIF_KEY_ID = "_m";
    public static final String NOTIF_KEY_MEDIA_ALT = "_mediaAlt";
    public static final String NOTIF_KEY_MEDIA_URL = "_mediaUrl";
    public static final String NOTIF_KEY_MESSAGE_HASH = "_h";
    public static final String NOTIF_KEY_MESSAGE_TYPE = "_mt";
    public static final String NOTIF_KEY_OPEN_DIRECT_URL = "_od";
    public static final String NOTIF_KEY_REQUEST_ID = "_r";
    public static final String NOTIF_KEY_SID = "_sid";
    public static final String NOTIF_KEY_SOUND = "sound";
    public static final String NOTIF_KEY_SUB_TITLE = "subtitle";
    public static final String NOTIF_KEY_TIMESTAMP = "timestamp";
    public static final String NOTIF_KEY_TITLE = "title";
    private final String alert;
    private final String custom;
    private final Map<String, String> customKeys;

    /* renamed from: id */
    private final String f33904id;
    private final String mediaAltText;
    private final String mediaUrl;
    private int notificationId;
    private final Map<String, String> payload;
    private final Region region;
    private final String requestId;
    private final Sound sound;
    private final String soundName;
    private final String subtitle;
    private final String title;
    private final Trigger trigger;
    private final Type type;
    private final String url;

    @MCKeep
    public enum Sound {
        CUSTOM,
        DEFAULT,
        NONE
    }

    @MCKeep
    public enum Trigger {
        PUSH,
        GEOFENCE,
        BEACON
    }

    @MCKeep
    public enum Type {
        OPEN_DIRECT,
        CLOUD_PAGE,
        OTHER
    }

    /* renamed from: com.salesforce.marketingcloud.notifications.NotificationMessage$a */
    public static final class C11693a {
        private C11693a() {
        }

        public /* synthetic */ C11693a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0092  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00a1  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.salesforce.marketingcloud.notifications.NotificationMessage mo30942a(com.salesforce.marketingcloud.messages.Message r24, com.salesforce.marketingcloud.messages.Region r25) {
            /*
                r23 = this;
                java.lang.String r0 = "message"
                r1 = r24
                kotlin.jvm.internal.C41536l.m120489i(r1, r0)
                java.lang.String r0 = "region"
                r4 = r25
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                java.lang.String r0 = r24.url()
                r2 = 0
                if (r0 == 0) goto L_0x0020
                com.salesforce.marketingcloud.notifications.NotificationMessage$Type r0 = com.salesforce.marketingcloud.notifications.NotificationMessage.Type.CLOUD_PAGE
                java.lang.String r3 = r24.url()
            L_0x001b:
                he1.m r0 = he1.C41233s.m119492a(r0, r3)
                goto L_0x0033
            L_0x0020:
                java.lang.String r0 = r24.openDirect()
                if (r0 == 0) goto L_0x002d
                com.salesforce.marketingcloud.notifications.NotificationMessage$Type r0 = com.salesforce.marketingcloud.notifications.NotificationMessage.Type.OPEN_DIRECT
                java.lang.String r3 = r24.openDirect()
                goto L_0x001b
            L_0x002d:
                com.salesforce.marketingcloud.notifications.NotificationMessage$Type r0 = com.salesforce.marketingcloud.notifications.NotificationMessage.Type.OTHER
                he1.m r0 = he1.C41233s.m119492a(r0, r2)
            L_0x0033:
                java.lang.Object r3 = r0.mo95675a()
                r10 = r3
                com.salesforce.marketingcloud.notifications.NotificationMessage$Type r10 = (com.salesforce.marketingcloud.notifications.NotificationMessage.Type) r10
                java.lang.Object r0 = r0.mo95676b()
                r12 = r0
                java.lang.String r12 = (java.lang.String) r12
                java.lang.String r0 = r24.sound()
                r15 = r23
                he1.m r0 = r15.mo30944a((java.lang.String) r0)
                java.lang.Object r3 = r0.mo95675a()
                r6 = r3
                com.salesforce.marketingcloud.notifications.NotificationMessage$Sound r6 = (com.salesforce.marketingcloud.notifications.NotificationMessage.Sound) r6
                java.lang.Object r0 = r0.mo95676b()
                r7 = r0
                java.lang.String r7 = (java.lang.String) r7
                int r0 = r24.messageType()
                r3 = 5
                if (r0 != r3) goto L_0x0063
                com.salesforce.marketingcloud.notifications.NotificationMessage$Trigger r0 = com.salesforce.marketingcloud.notifications.NotificationMessage.Trigger.BEACON
                goto L_0x0065
            L_0x0063:
                com.salesforce.marketingcloud.notifications.NotificationMessage$Trigger r0 = com.salesforce.marketingcloud.notifications.NotificationMessage.Trigger.GEOFENCE
            L_0x0065:
                r11 = r0
                java.lang.String r0 = r24.mo30330id()
                java.lang.String r8 = r24.title()
                java.lang.String r5 = r24.alert()
                java.util.Map r3 = r24.customKeys()
                if (r3 == 0) goto L_0x0082
                java.util.HashMap r3 = new java.util.HashMap
                java.util.Map r9 = r24.customKeys()
                r3.<init>(r9)
                goto L_0x0086
            L_0x0082:
                java.util.Map r3 = ie1.C41344r0.m119928j()
            L_0x0086:
                r16 = r3
                java.lang.String r21 = r24.custom()
                com.salesforce.marketingcloud.messages.Message$Media r3 = r24.media()
                if (r3 != 0) goto L_0x0094
                r13 = r2
                goto L_0x0099
            L_0x0094:
                java.lang.String r3 = r3.url()
                r13 = r3
            L_0x0099:
                com.salesforce.marketingcloud.messages.Message$Media r1 = r24.media()
                if (r1 != 0) goto L_0x00a1
                r14 = r2
                goto L_0x00a6
            L_0x00a1:
                java.lang.String r1 = r1.altText()
                r14 = r1
            L_0x00a6:
                com.salesforce.marketingcloud.notifications.NotificationMessage r22 = new com.salesforce.marketingcloud.notifications.NotificationMessage
                r1 = r22
                r3 = 0
                r9 = 0
                r17 = 0
                r18 = 0
                r19 = 98434(0x18082, float:1.37935E-40)
                r20 = 0
                r2 = r0
                r4 = r25
                r15 = r16
                r16 = r21
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                return r22
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.notifications.NotificationMessage.C11693a.mo30942a(com.salesforce.marketingcloud.messages.Message, com.salesforce.marketingcloud.messages.Region):com.salesforce.marketingcloud.notifications.NotificationMessage");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00d8, code lost:
            if (cf1.C40428n.m117038H(r14, ".google", false, 2, (java.lang.Object) null) != false) goto L_0x00e0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x011b  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.salesforce.marketingcloud.notifications.NotificationMessage mo30943a(java.util.Map<java.lang.String, java.lang.String> r25) {
            /*
                r24 = this;
                r0 = r25
                java.lang.String r1 = "data"
                kotlin.jvm.internal.C41536l.m120489i(r0, r1)
                java.lang.String r1 = "_x"
                boolean r2 = r0.containsKey(r1)
                r3 = 0
                if (r2 == 0) goto L_0x001b
                com.salesforce.marketingcloud.notifications.NotificationMessage$Type r2 = com.salesforce.marketingcloud.notifications.NotificationMessage.Type.CLOUD_PAGE
            L_0x0012:
                java.lang.Object r1 = r0.get(r1)
                he1.m r1 = he1.C41233s.m119492a(r2, r1)
                goto L_0x002c
            L_0x001b:
                java.lang.String r1 = "_od"
                boolean r2 = r0.containsKey(r1)
                if (r2 == 0) goto L_0x0026
                com.salesforce.marketingcloud.notifications.NotificationMessage$Type r2 = com.salesforce.marketingcloud.notifications.NotificationMessage.Type.OPEN_DIRECT
                goto L_0x0012
            L_0x0026:
                com.salesforce.marketingcloud.notifications.NotificationMessage$Type r1 = com.salesforce.marketingcloud.notifications.NotificationMessage.Type.OTHER
                he1.m r1 = he1.C41233s.m119492a(r1, r3)
            L_0x002c:
                java.lang.Object r2 = r1.mo95675a()
                r13 = r2
                com.salesforce.marketingcloud.notifications.NotificationMessage$Type r13 = (com.salesforce.marketingcloud.notifications.NotificationMessage.Type) r13
                java.lang.Object r1 = r1.mo95676b()
                r15 = r1
                java.lang.String r15 = (java.lang.String) r15
                java.lang.String r1 = "sound"
                java.lang.Object r1 = r0.get(r1)
                java.lang.String r1 = (java.lang.String) r1
                r2 = r24
                he1.m r1 = r2.mo30944a((java.lang.String) r1)
                java.lang.Object r4 = r1.mo95675a()
                r9 = r4
                com.salesforce.marketingcloud.notifications.NotificationMessage$Sound r9 = (com.salesforce.marketingcloud.notifications.NotificationMessage.Sound) r9
                java.lang.Object r1 = r1.mo95676b()
                r10 = r1
                java.lang.String r10 = (java.lang.String) r10
                java.lang.String r1 = "_m"
                java.lang.Object r1 = r0.get(r1)
                if (r1 == 0) goto L_0x011b
                r5 = r1
                java.lang.String r5 = (java.lang.String) r5
                java.lang.String r1 = "_r"
                java.lang.Object r1 = r0.get(r1)
                r6 = r1
                java.lang.String r6 = (java.lang.String) r6
                java.lang.String r1 = "title"
                java.lang.Object r1 = r0.get(r1)
                r11 = r1
                java.lang.String r11 = (java.lang.String) r11
                java.lang.String r1 = "subtitle"
                java.lang.Object r1 = r0.get(r1)
                r12 = r1
                java.lang.String r12 = (java.lang.String) r12
                java.lang.String r1 = "alert"
                java.lang.Object r1 = r0.get(r1)
                if (r1 == 0) goto L_0x010f
                r8 = r1
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r1 = "_mediaUrl"
                java.lang.Object r1 = r0.get(r1)
                r16 = r1
                java.lang.String r16 = (java.lang.String) r16
                java.lang.String r1 = "_mediaAlt"
                java.lang.Object r1 = r0.get(r1)
                r17 = r1
                java.lang.String r17 = (java.lang.String) r17
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>(r0)
                java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
                r7.<init>()
                java.util.Set r0 = r25.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L_0x00ad:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L_0x00f6
                java.lang.Object r4 = r0.next()
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r14 = r4.getKey()
                java.lang.String r14 = (java.lang.String) r14
                com.salesforce.marketingcloud.notifications.NotificationMessage$a r18 = com.salesforce.marketingcloud.notifications.NotificationMessage.Companion
                java.lang.String[] r3 = r18.mo30945a()
                boolean r3 = ie1.C41333m.m119794s(r3, r14)
                if (r3 == 0) goto L_0x00db
                java.lang.String r3 = ".google"
                r25 = r0
                r0 = 2
                r2 = 0
                r20 = r1
                r1 = 0
                boolean r0 = cf1.C40439w.m117109H(r14, r3, r2, r0, r1)
                if (r0 == 0) goto L_0x00e1
                goto L_0x00e0
            L_0x00db:
                r25 = r0
                r20 = r1
                r1 = 0
            L_0x00e0:
                r2 = 1
            L_0x00e1:
                if (r2 == 0) goto L_0x00ee
                java.lang.Object r0 = r4.getKey()
                java.lang.Object r2 = r4.getValue()
                r7.put(r0, r2)
            L_0x00ee:
                r2 = r24
                r0 = r25
                r3 = r1
                r1 = r20
                goto L_0x00ad
            L_0x00f6:
                r20 = r1
                com.salesforce.marketingcloud.notifications.NotificationMessage$Trigger r14 = com.salesforce.marketingcloud.notifications.NotificationMessage.Trigger.PUSH
                com.salesforce.marketingcloud.notifications.NotificationMessage r0 = new com.salesforce.marketingcloud.notifications.NotificationMessage
                r4 = r0
                r1 = 0
                r2 = r7
                r7 = r1
                r19 = 0
                r21 = 0
                r22 = 81924(0x14004, float:1.148E-40)
                r23 = 0
                r18 = r2
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r0
            L_0x010f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "alert missing"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x011b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "message id missing"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.notifications.NotificationMessage.C11693a.mo30943a(java.util.Map):com.salesforce.marketingcloud.notifications.NotificationMessage");
        }

        /* renamed from: a */
        public final C41224m mo30944a(String str) {
            Sound sound;
            if (str == null || C40439w.m117115s(str, "none", true)) {
                sound = Sound.NONE;
            } else if (!C40439w.m117115s(str, "default", true)) {
                return C41233s.m119492a(Sound.CUSTOM, str);
            } else {
                sound = Sound.DEFAULT;
            }
            return C41233s.m119492a(sound, (Object) null);
        }

        /* renamed from: a */
        public final String[] mo30945a() {
            return NotificationMessage.KNOWN_KEYS;
        }
    }

    /* renamed from: com.salesforce.marketingcloud.notifications.NotificationMessage$b */
    public static final class C11694b implements Parcelable.Creator<NotificationMessage> {
        /* renamed from: a */
        public final NotificationMessage createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String str;
            LinkedHashMap linkedHashMap2;
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Region createFromParcel = parcel.readInt() == 0 ? null : Region.CREATOR.createFromParcel(parcel2);
            String readString3 = parcel.readString();
            Sound valueOf = Sound.valueOf(parcel.readString());
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            Type valueOf2 = Type.valueOf(parcel.readString());
            Trigger valueOf3 = Trigger.valueOf(parcel.readString());
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt);
            int i = 0;
            while (i != readInt) {
                linkedHashMap3.put(parcel.readString(), parcel.readString());
                i++;
                readInt = readInt;
                readString9 = readString9;
            }
            String str2 = readString9;
            String readString10 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = linkedHashMap3;
                str = readString10;
                linkedHashMap2 = null;
            } else {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(readInt2);
                str = readString10;
                int i2 = 0;
                while (i2 != readInt2) {
                    linkedHashMap4.put(parcel.readString(), parcel.readString());
                    i2++;
                    readInt2 = readInt2;
                    linkedHashMap3 = linkedHashMap3;
                }
                linkedHashMap = linkedHashMap3;
                linkedHashMap2 = linkedHashMap4;
            }
            return new NotificationMessage(readString, readString2, createFromParcel, readString3, valueOf, readString4, readString5, readString6, valueOf2, valueOf3, readString7, readString8, str2, linkedHashMap, str, linkedHashMap2, parcel.readInt());
        }

        /* renamed from: a */
        public final NotificationMessage[] newArray(int i) {
            return new NotificationMessage[i];
        }
    }

    public NotificationMessage(String str, String str2, Region region2, String str3, Sound sound2, String str4, String str5, String str6, Type type2, Trigger trigger2, String str7, String str8, String str9, Map<String, String> map, String str10, Map<String, String> map2, int i) {
        Type type3 = type2;
        Trigger trigger3 = trigger2;
        Map<String, String> map3 = map;
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str3, "alert");
        C41536l.m120489i(sound2, "sound");
        C41536l.m120489i(type3, "type");
        C41536l.m120489i(trigger3, "trigger");
        C41536l.m120489i(map3, "customKeys");
        this.f33904id = str;
        this.requestId = str2;
        this.region = region2;
        this.alert = str3;
        this.sound = sound2;
        this.soundName = str4;
        this.title = str5;
        this.subtitle = str6;
        this.type = type3;
        this.trigger = trigger3;
        this.url = str7;
        this.mediaUrl = str8;
        this.mediaAltText = str9;
        this.customKeys = map3;
        this.custom = str10;
        this.payload = map2;
        this.notificationId = i;
    }

    public static /* synthetic */ NotificationMessage copy$default(NotificationMessage notificationMessage, String str, String str2, Region region2, String str3, Sound sound2, String str4, String str5, String str6, Type type2, Trigger trigger2, String str7, String str8, String str9, Map map, String str10, Map map2, int i, int i2, Object obj) {
        NotificationMessage notificationMessage2 = notificationMessage;
        int i3 = i2;
        return notificationMessage.copy((i3 & 1) != 0 ? notificationMessage2.f33904id : str, (i3 & 2) != 0 ? notificationMessage2.requestId : str2, (i3 & 4) != 0 ? notificationMessage2.region : region2, (i3 & 8) != 0 ? notificationMessage2.alert : str3, (i3 & 16) != 0 ? notificationMessage2.sound : sound2, (i3 & 32) != 0 ? notificationMessage2.soundName : str4, (i3 & 64) != 0 ? notificationMessage2.title : str5, (i3 & 128) != 0 ? notificationMessage2.subtitle : str6, (i3 & C11398b.f33139r) != 0 ? notificationMessage2.type : type2, (i3 & C11398b.f33140s) != 0 ? notificationMessage2.trigger : trigger2, (i3 & C11398b.f33141t) != 0 ? notificationMessage2.url : str7, (i3 & C11398b.f33142u) != 0 ? notificationMessage2.mediaUrl : str8, (i3 & C11398b.f33143v) != 0 ? notificationMessage2.mediaAltText : str9, (i3 & 8192) != 0 ? notificationMessage2.customKeys : map, (i3 & 16384) != 0 ? notificationMessage2.custom : str10, (i3 & 32768) != 0 ? notificationMessage2.payload : map2, (i3 & 65536) != 0 ? notificationMessage2.notificationId : i);
    }

    /* renamed from: -deprecated_alert  reason: not valid java name */
    public final String m124984deprecated_alert() {
        return this.alert;
    }

    /* renamed from: -deprecated_custom  reason: not valid java name */
    public final String m124985deprecated_custom() {
        return this.custom;
    }

    /* renamed from: -deprecated_customKeys  reason: not valid java name */
    public final Map<String, String> m124986deprecated_customKeys() {
        return this.customKeys;
    }

    /* renamed from: -deprecated_id  reason: not valid java name */
    public final String m124987deprecated_id() {
        return this.f33904id;
    }

    /* renamed from: -deprecated_mediaAltText  reason: not valid java name */
    public final String m124988deprecated_mediaAltText() {
        return this.mediaAltText;
    }

    /* renamed from: -deprecated_mediaUrl  reason: not valid java name */
    public final String m124989deprecated_mediaUrl() {
        return this.mediaUrl;
    }

    /* renamed from: -deprecated_notificationId  reason: not valid java name */
    public final int m124990deprecated_notificationId() {
        return this.notificationId;
    }

    /* renamed from: -deprecated_payload  reason: not valid java name */
    public final Map<String, String> m124991deprecated_payload() {
        return this.payload;
    }

    /* renamed from: -deprecated_region  reason: not valid java name */
    public final Region m124992deprecated_region() {
        return this.region;
    }

    /* renamed from: -deprecated_requestId  reason: not valid java name */
    public final String m124993deprecated_requestId() {
        return this.requestId;
    }

    /* renamed from: -deprecated_sound  reason: not valid java name */
    public final Sound m124994deprecated_sound() {
        return this.sound;
    }

    /* renamed from: -deprecated_soundName  reason: not valid java name */
    public final String m124995deprecated_soundName() {
        return this.soundName;
    }

    /* renamed from: -deprecated_subTitle  reason: not valid java name */
    public final String m124996deprecated_subTitle() {
        return this.subtitle;
    }

    /* renamed from: -deprecated_title  reason: not valid java name */
    public final String m124997deprecated_title() {
        return this.title;
    }

    /* renamed from: -deprecated_trigger  reason: not valid java name */
    public final Trigger m124998deprecated_trigger() {
        return this.trigger;
    }

    /* renamed from: -deprecated_type  reason: not valid java name */
    public final Type m124999deprecated_type() {
        return this.type;
    }

    /* renamed from: -deprecated_url  reason: not valid java name */
    public final String m125000deprecated_url() {
        return this.url;
    }

    public final String alert() {
        return this.alert;
    }

    public final String component1() {
        return this.f33904id;
    }

    public final Trigger component10() {
        return this.trigger;
    }

    public final String component11() {
        return this.url;
    }

    public final String component12() {
        return this.mediaUrl;
    }

    public final String component13() {
        return this.mediaAltText;
    }

    public final Map<String, String> component14() {
        return this.customKeys;
    }

    public final String component15() {
        return this.custom;
    }

    public final Map<String, String> component16() {
        return this.payload;
    }

    public final int component17$sdk_release() {
        return this.notificationId;
    }

    public final String component2() {
        return this.requestId;
    }

    public final Region component3() {
        return this.region;
    }

    public final String component4() {
        return this.alert;
    }

    public final Sound component5() {
        return this.sound;
    }

    public final String component6() {
        return this.soundName;
    }

    public final String component7() {
        return this.title;
    }

    public final String component8() {
        return this.subtitle;
    }

    public final Type component9() {
        return this.type;
    }

    public final NotificationMessage copy(String str, String str2, Region region2, String str3, Sound sound2, String str4, String str5, String str6, Type type2, Trigger trigger2, String str7, String str8, String str9, Map<String, String> map, String str10, Map<String, String> map2, int i) {
        String str11 = str;
        C41536l.m120489i(str11, "id");
        C41536l.m120489i(str3, "alert");
        C41536l.m120489i(sound2, "sound");
        C41536l.m120489i(type2, "type");
        C41536l.m120489i(trigger2, "trigger");
        C41536l.m120489i(map, "customKeys");
        return new NotificationMessage(str11, str2, region2, str3, sound2, str4, str5, str6, type2, trigger2, str7, str8, str9, map, str10, map2, i);
    }

    public final String custom() {
        return this.custom;
    }

    public final Map<String, String> customKeys() {
        return this.customKeys;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationMessage)) {
            return false;
        }
        NotificationMessage notificationMessage = (NotificationMessage) obj;
        return C41536l.m120484d(this.f33904id, notificationMessage.f33904id) && C41536l.m120484d(this.requestId, notificationMessage.requestId) && C41536l.m120484d(this.region, notificationMessage.region) && C41536l.m120484d(this.alert, notificationMessage.alert) && this.sound == notificationMessage.sound && C41536l.m120484d(this.soundName, notificationMessage.soundName) && C41536l.m120484d(this.title, notificationMessage.title) && C41536l.m120484d(this.subtitle, notificationMessage.subtitle) && this.type == notificationMessage.type && this.trigger == notificationMessage.trigger && C41536l.m120484d(this.url, notificationMessage.url) && C41536l.m120484d(this.mediaUrl, notificationMessage.mediaUrl) && C41536l.m120484d(this.mediaAltText, notificationMessage.mediaAltText) && C41536l.m120484d(this.customKeys, notificationMessage.customKeys) && C41536l.m120484d(this.custom, notificationMessage.custom) && C41536l.m120484d(this.payload, notificationMessage.payload) && this.notificationId == notificationMessage.notificationId;
    }

    public int hashCode() {
        int hashCode = this.f33904id.hashCode() * 31;
        String str = this.requestId;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Region region2 = this.region;
        int hashCode3 = (((((hashCode2 + (region2 == null ? 0 : region2.hashCode())) * 31) + this.alert.hashCode()) * 31) + this.sound.hashCode()) * 31;
        String str2 = this.soundName;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtitle;
        int hashCode6 = (((((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.type.hashCode()) * 31) + this.trigger.hashCode()) * 31;
        String str5 = this.url;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.mediaUrl;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.mediaAltText;
        int hashCode9 = (((hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.customKeys.hashCode()) * 31;
        String str8 = this.custom;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Map<String, String> map = this.payload;
        if (map != null) {
            i = map.hashCode();
        }
        return ((hashCode10 + i) * 31) + this.notificationId;
    }

    /* renamed from: id */
    public final String mo30925id() {
        return this.f33904id;
    }

    public final String mediaAltText() {
        return this.mediaAltText;
    }

    public final String mediaUrl() {
        return this.mediaUrl;
    }

    public final int notificationId() {
        return this.notificationId;
    }

    public final Map<String, String> payload() {
        return this.payload;
    }

    public final Region region() {
        return this.region;
    }

    public final String requestId() {
        return this.requestId;
    }

    public final void setNotificationId$sdk_release(int i) {
        this.notificationId = i;
    }

    public final Sound sound() {
        return this.sound;
    }

    public final String soundName() {
        return this.soundName;
    }

    public final String subtitle() {
        return this.subtitle;
    }

    public final String title() {
        return this.title;
    }

    public String toString() {
        return "NotificationMessage(id=" + this.f33904id + ", requestId=" + this.requestId + ", region=" + this.region + ", alert=" + this.alert + ", sound=" + this.sound + ", soundName=" + this.soundName + ", title=" + this.title + ", subtitle=" + this.subtitle + ", type=" + this.type + ", trigger=" + this.trigger + ", url=" + this.url + ", mediaUrl=" + this.mediaUrl + ", mediaAltText=" + this.mediaAltText + ", customKeys=" + this.customKeys + ", custom=" + this.custom + ", payload=" + this.payload + ", notificationId=" + this.notificationId + ')';
    }

    public final Trigger trigger() {
        return this.trigger;
    }

    public final Type type() {
        return this.type;
    }

    public final String url() {
        return this.url;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f33904id);
        parcel.writeString(this.requestId);
        Region region2 = this.region;
        if (region2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            region2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.alert);
        parcel.writeString(this.sound.name());
        parcel.writeString(this.soundName);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.type.name());
        parcel.writeString(this.trigger.name());
        parcel.writeString(this.url);
        parcel.writeString(this.mediaUrl);
        parcel.writeString(this.mediaAltText);
        Map<String, String> map = this.customKeys;
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
        parcel.writeString(this.custom);
        Map<String, String> map2 = this.payload;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry next2 : map2.entrySet()) {
                parcel.writeString((String) next2.getKey());
                parcel.writeString((String) next2.getValue());
            }
        }
        parcel.writeInt(this.notificationId);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NotificationMessage(java.lang.String r22, java.lang.String r23, com.salesforce.marketingcloud.messages.Region r24, java.lang.String r25, com.salesforce.marketingcloud.notifications.NotificationMessage.Sound r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, com.salesforce.marketingcloud.notifications.NotificationMessage.Type r30, com.salesforce.marketingcloud.notifications.NotificationMessage.Trigger r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.util.Map r35, java.lang.String r36, java.util.Map r37, int r38, int r39, kotlin.jvm.internal.DefaultConstructorMarker r40) {
        /*
            r21 = this;
            r0 = r39
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000b
        L_0x0009:
            r5 = r23
        L_0x000b:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0011
            r6 = r2
            goto L_0x0013
        L_0x0011:
            r6 = r24
        L_0x0013:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0019
            r9 = r2
            goto L_0x001b
        L_0x0019:
            r9 = r27
        L_0x001b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0021
            r10 = r2
            goto L_0x0023
        L_0x0021:
            r10 = r28
        L_0x0023:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0029
            r11 = r2
            goto L_0x002b
        L_0x0029:
            r11 = r29
        L_0x002b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0031
            r14 = r2
            goto L_0x0033
        L_0x0031:
            r14 = r32
        L_0x0033:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0039
            r15 = r2
            goto L_0x003b
        L_0x0039:
            r15 = r33
        L_0x003b:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0042
            r16 = r2
            goto L_0x0044
        L_0x0042:
            r16 = r34
        L_0x0044:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x004f
            java.util.Map r1 = ie1.C41344r0.m119928j()
            r17 = r1
            goto L_0x0051
        L_0x004f:
            r17 = r35
        L_0x0051:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0058
            r18 = r2
            goto L_0x005a
        L_0x0058:
            r18 = r36
        L_0x005a:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0063
            r19 = r2
            goto L_0x0065
        L_0x0063:
            r19 = r37
        L_0x0065:
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x006e
            r0 = -1
            r20 = r0
            goto L_0x0070
        L_0x006e:
            r20 = r38
        L_0x0070:
            r3 = r21
            r4 = r22
            r7 = r25
            r8 = r26
            r12 = r30
            r13 = r31
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.notifications.NotificationMessage.<init>(java.lang.String, java.lang.String, com.salesforce.marketingcloud.messages.Region, java.lang.String, com.salesforce.marketingcloud.notifications.NotificationMessage$Sound, java.lang.String, java.lang.String, java.lang.String, com.salesforce.marketingcloud.notifications.NotificationMessage$Type, com.salesforce.marketingcloud.notifications.NotificationMessage$Trigger, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
