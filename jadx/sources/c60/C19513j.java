package c60;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.smstopush.entitiy.MessageMode;
import p341ge.bog.mobilebank.cleanarch.domain.smstopush.model.SmsNotification;
import p341ge.bog.mobilebank.cleanarch.presentation.smstopush.SmsToPushException;

/* renamed from: c60.j */
public abstract class C19513j {

    /* renamed from: c */
    public static final C19514a f53810c = new C19514a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f53811a;

    /* renamed from: b */
    private final List f53812b;

    /* renamed from: c60.j$a */
    public static final class C19514a {
        private C19514a() {
        }

        public /* synthetic */ C19514a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C19513j mo47753a(List list) {
            boolean z;
            C41536l.m120489i(list, "activeNotifications");
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                boolean z2 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((SmsNotification) next).mo52110b() == MessageMode.SMS) {
                    z2 = true;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : list) {
                if (((SmsNotification) next2).mo52110b() == MessageMode.PUSH) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList2.add(next2);
                }
            }
            if (arrayList.size() > 1 && (!arrayList2.isEmpty())) {
                return new C19515b(arrayList);
            }
            if (arrayList.size() > 1 && arrayList2.isEmpty()) {
                return new C19516c(arrayList);
            }
            if (arrayList.size() == 1 && arrayList2.isEmpty()) {
                return new C19518e(arrayList);
            }
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                return C19519f.f53817d;
            }
            if (arrayList.size() == 1 && (!arrayList2.isEmpty())) {
                return new C19517d(arrayList);
            }
            throw new SmsToPushException("Unknown state");
        }
    }

    /* renamed from: c60.j$b */
    public static final class C19515b extends C19513j {

        /* renamed from: d */
        private final List f53813d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19515b(List list) {
            super("rbc.msg.multiple.sms.exists.push.exsists", C41341q.m119907j(), (DefaultConstructorMarker) null);
            C41536l.m120489i(list, "smsNotifications");
            this.f53813d = list;
        }

        /* renamed from: a */
        public List mo47751a() {
            return this.f53813d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C19515b) && C41536l.m120484d(this.f53813d, ((C19515b) obj).f53813d);
        }

        public int hashCode() {
            return this.f53813d.hashCode();
        }

        public String toString() {
            List list = this.f53813d;
            return "MultipleSmsExistsPushExists(smsNotifications=" + list + ")";
        }
    }

    /* renamed from: c60.j$c */
    public static final class C19516c extends C19513j {

        /* renamed from: d */
        private final List f53814d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19516c(List list) {
            super("rbc.msg.multiple.sms.exists.push.not.exsists", C41341q.m119907j(), (DefaultConstructorMarker) null);
            C41536l.m120489i(list, "smsNotifications");
            this.f53814d = list;
        }

        /* renamed from: a */
        public List mo47751a() {
            return this.f53814d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C19516c) && C41536l.m120484d(this.f53814d, ((C19516c) obj).f53814d);
        }

        public int hashCode() {
            return this.f53814d.hashCode();
        }

        public String toString() {
            List list = this.f53814d;
            return "MultipleSmsExistsPushNotExists(smsNotifications=" + list + ")";
        }
    }

    /* renamed from: c60.j$d */
    public static final class C19517d extends C19513j {

        /* renamed from: d */
        private final List f53815d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19517d(List list) {
            super("rbc.msg.sms.exists.push.exists", C41341q.m119907j(), (DefaultConstructorMarker) null);
            C41536l.m120489i(list, "smsNotifications");
            this.f53815d = list;
        }

        /* renamed from: a */
        public List mo47751a() {
            return this.f53815d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C19517d) && C41536l.m120484d(this.f53815d, ((C19517d) obj).f53815d);
        }

        public int hashCode() {
            return this.f53815d.hashCode();
        }

        public String toString() {
            List list = this.f53815d;
            return "SmsExistsPushExists(smsNotifications=" + list + ")";
        }
    }

    /* renamed from: c60.j$e */
    public static final class C19518e extends C19513j {

        /* renamed from: d */
        private final List f53816d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19518e(List list) {
            super("rbc.msg.sms.exists.push.not.exists", C41341q.m119907j(), (DefaultConstructorMarker) null);
            C41536l.m120489i(list, "smsNotifications");
            this.f53816d = list;
        }

        /* renamed from: a */
        public List mo47751a() {
            return this.f53816d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C19518e) && C41536l.m120484d(this.f53816d, ((C19518e) obj).f53816d);
        }

        public int hashCode() {
            return this.f53816d.hashCode();
        }

        public String toString() {
            List list = this.f53816d;
            return "SmsExistsPushNotExists(smsNotifications=" + list + ")";
        }
    }

    /* renamed from: c60.j$f */
    public static final class C19519f extends C19513j {

        /* renamed from: d */
        public static final C19519f f53817d = new C19519f();

        private C19519f() {
            super("rbc.msg.sms.not.exists.push.not.exists", C41341q.m119907j(), (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C19513j(String str, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list);
    }

    /* renamed from: a */
    public List mo47751a() {
        return this.f53812b;
    }

    /* renamed from: b */
    public String mo47752b() {
        return this.f53811a;
    }

    private C19513j(String str, List list) {
        this.f53811a = str;
        this.f53812b = list;
    }
}
