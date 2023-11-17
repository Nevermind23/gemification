package rc0;

import ad0.C19227a;
import android.content.Context;
import androidx.collection.ArrayMap;
import bd0.C19370a;
import cd0.C19725b;
import com.google.gson.C5494h;
import com.google.gson.Gson;
import df1.C40651b;
import df1.C40654d;
import df1.C40655e;
import ef1.C40793d0;
import g91.C32359z0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.C41556a;
import kotlinx.coroutines.flow.C41558c;
import kotlinx.coroutines.flow.C41568k;
import kotlinx.coroutines.flow.C41581t;
import oe1.C41853d;
import p316xa.C8982a;
import p341ge.bog.mobilebank.dictionary.data.entity.DictionaryDataEntity;
import p341ge.bog.mobilebank.dictionary.data.entity.DictionaryEntity;
import p341ge.bog.mobilebank.dictionary.data.entity.DictionarySegmentRelations;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p726cs.C19792a;
import p748eu.C20292b;
import p758fu.C20557a;
import sc0.C28188a;
import uc0.C28700a;
import vc0.C29035a;

/* renamed from: rc0.a */
public final class C27990a implements C19370a {

    /* renamed from: m */
    public static final C27991a f71312m = new C27991a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C28188a f71313a;

    /* renamed from: b */
    private final C28700a f71314b;

    /* renamed from: c */
    private final C20292b f71315c;

    /* renamed from: d */
    private final C19725b f71316d;

    /* renamed from: e */
    private final C19792a f71317e;

    /* renamed from: f */
    private final C29035a f71318f;

    /* renamed from: g */
    private final PreferencesApiManager f71319g;

    /* renamed from: h */
    private final Gson f71320h;

    /* renamed from: i */
    private final Context f71321i;

    /* renamed from: j */
    private final HashMap f71322j = new HashMap();

    /* renamed from: k */
    private final HashMap f71323k = new HashMap();

    /* renamed from: l */
    private final C41568k f71324l = C41581t.m120610a(Boolean.FALSE);

    /* renamed from: rc0.a$a */
    public static final class C27991a {
        private C27991a() {
        }

        public /* synthetic */ C27991a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: rc0.a$b */
    static final class C27992b extends C41853d {

        /* renamed from: g */
        Object f71325g;

        /* renamed from: h */
        Object f71326h;

        /* renamed from: i */
        /* synthetic */ Object f71327i;

        /* renamed from: j */
        final /* synthetic */ C27990a f71328j;

        /* renamed from: k */
        int f71329k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27992b(C27990a aVar, Continuation continuation) {
            super(continuation);
            this.f71328j = aVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f71327i = obj;
            this.f71329k |= Integer.MIN_VALUE;
            return this.f71328j.m86382j(this);
        }
    }

    /* renamed from: rc0.a$c */
    static final class C27993c extends C41853d {

        /* renamed from: g */
        Object f71330g;

        /* renamed from: h */
        /* synthetic */ Object f71331h;

        /* renamed from: i */
        final /* synthetic */ C27990a f71332i;

        /* renamed from: j */
        int f71333j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27993c(C27990a aVar, Continuation continuation) {
            super(continuation);
            this.f71332i = aVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f71331h = obj;
            this.f71333j |= Integer.MIN_VALUE;
            return this.f71332i.mo47580a(false, (C40793d0) null, this);
        }
    }

    /* renamed from: rc0.a$d */
    static final class C27994d extends C41853d {

        /* renamed from: g */
        Object f71334g;

        /* renamed from: h */
        Object f71335h;

        /* renamed from: i */
        Object f71336i;

        /* renamed from: j */
        /* synthetic */ Object f71337j;

        /* renamed from: k */
        final /* synthetic */ C27990a f71338k;

        /* renamed from: l */
        int f71339l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27994d(C27990a aVar, Continuation continuation) {
            super(continuation);
            this.f71338k = aVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f71337j = obj;
            this.f71339l |= Integer.MIN_VALUE;
            return this.f71338k.m86386n(this);
        }
    }

    /* renamed from: rc0.a$e */
    static final class C27995e extends C41853d {

        /* renamed from: g */
        Object f71340g;

        /* renamed from: h */
        /* synthetic */ Object f71341h;

        /* renamed from: i */
        final /* synthetic */ C27990a f71342i;

        /* renamed from: j */
        int f71343j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27995e(C27990a aVar, Continuation continuation) {
            super(continuation);
            this.f71342i = aVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f71341h = obj;
            this.f71343j |= Integer.MIN_VALUE;
            return this.f71342i.m86387o((ArrayMap) null, (ArrayMap) null, this);
        }
    }

    /* renamed from: rc0.a$f */
    static final class C27996f extends C41853d {

        /* renamed from: g */
        Object f71344g;

        /* renamed from: h */
        Object f71345h;

        /* renamed from: i */
        Object f71346i;

        /* renamed from: j */
        /* synthetic */ Object f71347j;

        /* renamed from: k */
        final /* synthetic */ C27990a f71348k;

        /* renamed from: l */
        int f71349l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27996f(C27990a aVar, Continuation continuation) {
            super(continuation);
            this.f71348k = aVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f71347j = obj;
            this.f71349l |= Integer.MIN_VALUE;
            return this.f71348k.m86388p((DictionaryEntity) null, this);
        }
    }

    /* renamed from: rc0.a$g */
    public static final class C27997g extends C8982a<DictionaryEntity> {
        C27997g() {
        }
    }

    /* renamed from: rc0.a$h */
    static final class C27998h extends C41853d {

        /* renamed from: g */
        Object f71350g;

        /* renamed from: h */
        Object f71351h;

        /* renamed from: i */
        /* synthetic */ Object f71352i;

        /* renamed from: j */
        final /* synthetic */ C27990a f71353j;

        /* renamed from: k */
        int f71354k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27998h(C27990a aVar, Continuation continuation) {
            super(continuation);
            this.f71353j = aVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f71352i = obj;
            this.f71354k |= Integer.MIN_VALUE;
            return this.f71353j.mo47584e(false, this);
        }
    }

    public C27990a(C28188a aVar, C28700a aVar2, C20292b bVar, C19725b bVar2, C19792a aVar3, C29035a aVar4, PreferencesApiManager preferencesApiManager, Gson gson, Context context) {
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(aVar2, "localDataSource");
        C41536l.m120489i(bVar, "getAppSettingsByName");
        C41536l.m120489i(bVar2, "getDictionaryUpdatePeriodInMinutes");
        C41536l.m120489i(aVar3, "databaseFullSubject");
        C41536l.m120489i(aVar4, "mapper");
        C41536l.m120489i(preferencesApiManager, "preferences");
        C41536l.m120489i(gson, "gson");
        C41536l.m120489i(context, "context");
        this.f71313a = aVar;
        this.f71314b = aVar2;
        this.f71315c = bVar;
        this.f71316d = bVar2;
        this.f71317e = aVar3;
        this.f71318f = aVar4;
        this.f71319g = preferencesApiManager;
        this.f71320h = gson;
        this.f71321i = context;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b4 A[LOOP:1: B:30:0x00ae->B:32:0x00b4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m86382j(kotlin.coroutines.Continuation r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof rc0.C27990a.C27992b
            if (r0 == 0) goto L_0x0013
            r0 = r10
            rc0.a$b r0 = (rc0.C27990a.C27992b) r0
            int r1 = r0.f71329k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f71329k = r1
            goto L_0x0018
        L_0x0013:
            rc0.a$b r0 = new rc0.a$b
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f71327i
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f71329k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r1 = r0.f71326h
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.f71325g
            rc0.a r0 = (rc0.C27990a) r0
            he1.C41228o.m119483b(r10)
            goto L_0x0069
        L_0x0034:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x003c:
            java.lang.Object r2 = r0.f71325g
            rc0.a r2 = (rc0.C27990a) r2
            he1.C41228o.m119483b(r10)
            goto L_0x0055
        L_0x0044:
            he1.C41228o.m119483b(r10)
            uc0.a r10 = r9.f71314b
            r0.f71325g = r9
            r0.f71329k = r4
            java.lang.Object r10 = r10.mo68439d(r0)
            if (r10 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r2 = r9
        L_0x0055:
            java.util.List r10 = (java.util.List) r10
            uc0.a r5 = r2.f71314b
            r0.f71325g = r2
            r0.f71326h = r10
            r0.f71329k = r3
            java.lang.Object r0 = r5.mo68437b(r0)
            if (r0 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r1 = r10
            r10 = r0
            r0 = r2
        L_0x0069:
            java.util.List r10 = (java.util.List) r10
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0079:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00aa
            java.lang.Object r5 = r1.next()
            ad0.a r5 = (ad0.C19227a) r5
            java.lang.String r6 = r5.mo47463c()
            java.lang.Object r6 = r2.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x0099
            boolean r5 = r6.add(r5)
            oe1.C41851b.m121254a(r5)
            goto L_0x0079
        L_0x0099:
            java.lang.String r6 = r5.mo47463c()
            ad0.a[] r7 = new ad0.C19227a[r4]
            r8 = 0
            r7[r8] = r5
            java.util.List r5 = ie1.C41341q.m119913p(r7)
            r2.put(r6, r5)
            goto L_0x0079
        L_0x00aa:
            java.util.Iterator r10 = r10.iterator()
        L_0x00ae:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x00c2
            java.lang.Object r1 = r10.next()
            ad0.a r1 = (ad0.C19227a) r1
            java.lang.String r4 = r1.mo47463c()
            r3.put(r4, r1)
            goto L_0x00ae
        L_0x00c2:
            vc0.a r10 = r0.f71318f
            java.lang.String r1 = r0.m86384l()
            java.lang.String r4 = "getClientSegment()"
            kotlin.jvm.internal.C41536l.m120488h(r1, r4)
            ge.bog.mobilebank.dictionary.data.entity.DictionarySegmentRelations r4 = r0.m86385m()
            androidx.collection.ArrayMap r10 = r10.mo68906e(r2, r1, r4)
            r0.m86383k(r10, r3)
            he1.w r10 = he1.C41238w.f97225a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: rc0.C27990a.m86382j(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: k */
    private final void m86383k(Map map, Map map2) {
        this.f71324l.setValue(Boolean.FALSE);
        this.f71322j.putAll(map);
        this.f71323k.putAll(map2);
        this.f71324l.setValue(Boolean.TRUE);
    }

    /* renamed from: l */
    private final String m86384l() {
        boolean z;
        String clientSegment = this.f71319g.getClientSegment();
        if (clientSegment == null || clientSegment.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C27999b.COMMON.mo67555c();
        }
        return this.f71319g.getClientSegment();
    }

    /* renamed from: m */
    private final DictionarySegmentRelations m86385m() {
        C5494h b;
        C20557a a = this.f71315c.mo48774a("DICTIONARY_DEFAULT_SEGMENT_RELATIONS");
        if (a == null || (b = a.mo49085b()) == null) {
            return null;
        }
        return (DictionarySegmentRelations) this.f71320h.mo18165g(b, DictionarySegmentRelations.class);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m86386n(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof rc0.C27990a.C27994d
            if (r0 == 0) goto L_0x0013
            r0 = r9
            rc0.a$d r0 = (rc0.C27990a.C27994d) r0
            int r1 = r0.f71339l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f71339l = r1
            goto L_0x0018
        L_0x0013:
            rc0.a$d r0 = new rc0.a$d
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f71337j
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f71339l
            r3 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r1 = r0.f71336i
            androidx.collection.ArrayMap r1 = (androidx.collection.ArrayMap) r1
            java.lang.Object r2 = r0.f71335h
            androidx.collection.ArrayMap r2 = (androidx.collection.ArrayMap) r2
            java.lang.Object r0 = r0.f71334g
            rc0.a r0 = (rc0.C27990a) r0
            he1.C41228o.m119483b(r9)
            goto L_0x007e
        L_0x0035:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003d:
            he1.C41228o.m119483b(r9)
            androidx.collection.ArrayMap r9 = new androidx.collection.ArrayMap
            r9.<init>()
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            rc0.b[] r4 = rc0.C27999b.values()
            int r5 = r4.length
            r6 = 0
        L_0x0050:
            if (r6 >= r5) goto L_0x005a
            r7 = r4[r6]
            r8.m86389q(r7, r9, r2)
            int r6 = r6 + 1
            goto L_0x0050
        L_0x005a:
            java.lang.String r4 = r8.m86384l()
            ge.bog.mobilebank.dictionary.data.entity.DictionarySegmentRelations r5 = r8.m86385m()
            vc0.a r6 = r8.f71318f
            java.lang.String r7 = "clientSegment"
            kotlin.jvm.internal.C41536l.m120488h(r4, r7)
            androidx.collection.ArrayMap r9 = r6.mo68906e(r9, r4, r5)
            r0.f71334g = r8
            r0.f71335h = r2
            r0.f71336i = r9
            r0.f71339l = r3
            java.lang.Object r0 = r8.m86387o(r9, r2, r0)
            if (r0 != r1) goto L_0x007c
            return r1
        L_0x007c:
            r0 = r8
            r1 = r9
        L_0x007e:
            r0.m86383k(r1, r2)
            he1.w r9 = he1.C41238w.f97225a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rc0.C27990a.m86386n(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m86387o(androidx.collection.ArrayMap r11, androidx.collection.ArrayMap r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof rc0.C27990a.C27995e
            if (r0 == 0) goto L_0x0013
            r0 = r13
            rc0.a$e r0 = (rc0.C27990a.C27995e) r0
            int r1 = r0.f71343j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f71343j = r1
            goto L_0x0018
        L_0x0013:
            rc0.a$e r0 = new rc0.a$e
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f71341h
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f71343j
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r11 = r0.f71340g
            rc0.a r11 = (rc0.C27990a) r11
            he1.C41228o.m119483b(r13)     // Catch:{ SQLiteFullException -> 0x00bf }
            goto L_0x00c4
        L_0x002e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0036:
            he1.C41228o.m119483b(r13)
            uc0.a r13 = r10.f71314b     // Catch:{ SQLiteFullException -> 0x00be }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteFullException -> 0x00be }
            java.util.Collection r11 = r11.values()     // Catch:{ SQLiteFullException -> 0x00be }
            r2.<init>(r11)     // Catch:{ SQLiteFullException -> 0x00be }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ SQLiteFullException -> 0x00be }
            r4 = 10
            int r5 = ie1.C41343r.m119925u(r2, r4)     // Catch:{ SQLiteFullException -> 0x00be }
            r11.<init>(r5)     // Catch:{ SQLiteFullException -> 0x00be }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ SQLiteFullException -> 0x00be }
        L_0x0053:
            boolean r5 = r2.hasNext()     // Catch:{ SQLiteFullException -> 0x00be }
            if (r5 == 0) goto L_0x0078
            java.lang.Object r5 = r2.next()     // Catch:{ SQLiteFullException -> 0x00be }
            ad0.a r5 = (ad0.C19227a) r5     // Catch:{ SQLiteFullException -> 0x00be }
            xc0.a r6 = new xc0.a     // Catch:{ SQLiteFullException -> 0x00be }
            java.lang.String r7 = r5.mo47463c()     // Catch:{ SQLiteFullException -> 0x00be }
            java.lang.String r8 = r5.mo47464d()     // Catch:{ SQLiteFullException -> 0x00be }
            java.lang.String r9 = r5.mo47465e()     // Catch:{ SQLiteFullException -> 0x00be }
            java.lang.String r5 = r5.mo47467f()     // Catch:{ SQLiteFullException -> 0x00be }
            r6.<init>(r7, r8, r9, r5)     // Catch:{ SQLiteFullException -> 0x00be }
            r11.add(r6)     // Catch:{ SQLiteFullException -> 0x00be }
            goto L_0x0053
        L_0x0078:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteFullException -> 0x00be }
            java.util.Collection r12 = r12.values()     // Catch:{ SQLiteFullException -> 0x00be }
            r2.<init>(r12)     // Catch:{ SQLiteFullException -> 0x00be }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteFullException -> 0x00be }
            int r4 = ie1.C41343r.m119925u(r2, r4)     // Catch:{ SQLiteFullException -> 0x00be }
            r12.<init>(r4)     // Catch:{ SQLiteFullException -> 0x00be }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ SQLiteFullException -> 0x00be }
        L_0x008e:
            boolean r4 = r2.hasNext()     // Catch:{ SQLiteFullException -> 0x00be }
            if (r4 == 0) goto L_0x00b3
            java.lang.Object r4 = r2.next()     // Catch:{ SQLiteFullException -> 0x00be }
            ad0.a r4 = (ad0.C19227a) r4     // Catch:{ SQLiteFullException -> 0x00be }
            xc0.c r5 = new xc0.c     // Catch:{ SQLiteFullException -> 0x00be }
            java.lang.String r6 = r4.mo47463c()     // Catch:{ SQLiteFullException -> 0x00be }
            java.lang.String r7 = r4.mo47464d()     // Catch:{ SQLiteFullException -> 0x00be }
            java.lang.String r8 = r4.mo47465e()     // Catch:{ SQLiteFullException -> 0x00be }
            java.lang.String r4 = r4.mo47467f()     // Catch:{ SQLiteFullException -> 0x00be }
            r5.<init>(r6, r7, r8, r4)     // Catch:{ SQLiteFullException -> 0x00be }
            r12.add(r5)     // Catch:{ SQLiteFullException -> 0x00be }
            goto L_0x008e
        L_0x00b3:
            r0.f71340g = r10     // Catch:{ SQLiteFullException -> 0x00be }
            r0.f71343j = r3     // Catch:{ SQLiteFullException -> 0x00be }
            java.lang.Object r11 = r13.mo68436a(r11, r12, r0)     // Catch:{ SQLiteFullException -> 0x00be }
            if (r11 != r1) goto L_0x00c4
            return r1
        L_0x00be:
            r11 = r10
        L_0x00bf:
            cs.a r11 = r11.f71317e
            r11.mo48080b()
        L_0x00c4:
            he1.w r11 = he1.C41238w.f97225a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: rc0.C27990a.m86387o(androidx.collection.ArrayMap, androidx.collection.ArrayMap, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m86388p(p341ge.bog.mobilebank.dictionary.data.entity.DictionaryEntity r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof rc0.C27990a.C27996f
            if (r0 == 0) goto L_0x0013
            r0 = r12
            rc0.a$f r0 = (rc0.C27990a.C27996f) r0
            int r1 = r0.f71349l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f71349l = r1
            goto L_0x0018
        L_0x0013:
            rc0.a$f r0 = new rc0.a$f
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f71347j
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f71349l
            r3 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r11 = r0.f71346i
            androidx.collection.ArrayMap r11 = (androidx.collection.ArrayMap) r11
            java.lang.Object r1 = r0.f71345h
            androidx.collection.ArrayMap r1 = (androidx.collection.ArrayMap) r1
            java.lang.Object r0 = r0.f71344g
            rc0.a r0 = (rc0.C27990a) r0
            he1.C41228o.m119483b(r12)
            goto L_0x0089
        L_0x0035:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003d:
            he1.C41228o.m119483b(r12)
            ge.bog.mobilebank.dictionary.data.entity.DictionaryDataEntity r5 = r11.getData()
            if (r5 == 0) goto L_0x0057
            vc0.a r4 = r10.f71318f
            rc0.b r12 = rc0.C27999b.COMMON
            java.lang.String r6 = r12.mo67555c()
            r7 = 0
            r8 = 4
            r9 = 0
            androidx.collection.ArrayMap r12 = vc0.C29035a.m88854c(r4, r5, r6, r7, r8, r9)
            if (r12 != 0) goto L_0x005c
        L_0x0057:
            androidx.collection.ArrayMap r12 = new androidx.collection.ArrayMap
            r12.<init>()
        L_0x005c:
            ge.bog.mobilebank.dictionary.data.entity.DictionaryDataEntity r5 = r11.getProviderData()
            if (r5 == 0) goto L_0x0073
            vc0.a r4 = r10.f71318f
            rc0.b r11 = rc0.C27999b.COMMON
            java.lang.String r6 = r11.mo67555c()
            r7 = 0
            r8 = 4
            r9 = 0
            androidx.collection.ArrayMap r11 = vc0.C29035a.m88854c(r4, r5, r6, r7, r8, r9)
            if (r11 != 0) goto L_0x0078
        L_0x0073:
            androidx.collection.ArrayMap r11 = new androidx.collection.ArrayMap
            r11.<init>()
        L_0x0078:
            r0.f71344g = r10
            r0.f71345h = r12
            r0.f71346i = r11
            r0.f71349l = r3
            java.lang.Object r0 = r10.m86387o(r12, r11, r0)
            if (r0 != r1) goto L_0x0087
            return r1
        L_0x0087:
            r0 = r10
            r1 = r12
        L_0x0089:
            r0.m86383k(r1, r11)
            he1.w r11 = he1.C41238w.f97225a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: rc0.C27990a.m86388p(ge.bog.mobilebank.dictionary.data.entity.DictionaryEntity, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: q */
    private final void m86389q(C27999b bVar, ArrayMap arrayMap, ArrayMap arrayMap2) {
        DictionaryDataEntity providerData;
        DictionaryDataEntity data;
        DictionaryEntity s = mo67553s(bVar.mo67554b());
        ArrayMap arrayMap3 = new ArrayMap();
        if (!(s == null || (data = s.getData()) == null)) {
            this.f71318f.mo68905b(data, bVar.mo67555c(), arrayMap3);
        }
        if (!(s == null || (providerData = s.getProviderData()) == null)) {
            this.f71318f.mo68905b(providerData, bVar.mo67555c(), arrayMap2);
        }
        for (Map.Entry entry : arrayMap3.entrySet()) {
            List list = (List) arrayMap.get(entry.getKey());
            if (list != null) {
                Object value = entry.getValue();
                C41536l.m120488h(value, "entry.value");
                list.add(value);
            } else {
                Object key = entry.getKey();
                Object value2 = entry.getValue();
                C41536l.m120488h(value2, "entry.value");
                arrayMap.put(key, C41341q.m119903f(value2));
            }
        }
        if (s != null) {
            this.f71319g.setDictionaryHashCode(s.getHashCode());
        }
    }

    /* renamed from: r */
    private final boolean m86390r() {
        long commonDataLastSyncDate = this.f71319g.getCommonDataLastSyncDate();
        if (System.currentTimeMillis() - commonDataLastSyncDate < C40651b.m117471F(C40654d.m117511o(this.f71316d.mo47930a(), C40655e.MINUTES), C40655e.MILLISECONDS)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0086 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo47580a(boolean r8, ef1.C40793d0 r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r9 = r10 instanceof rc0.C27990a.C27993c
            if (r9 == 0) goto L_0x0013
            r9 = r10
            rc0.a$c r9 = (rc0.C27990a.C27993c) r9
            int r0 = r9.f71333j
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r9.f71333j = r0
            goto L_0x0018
        L_0x0013:
            rc0.a$c r9 = new rc0.a$c
            r9.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r9.f71331h
            java.lang.Object r0 = ne1.C41793d.m121157c()
            int r1 = r9.f71333j
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L_0x004f
            if (r1 == r6) goto L_0x0047
            if (r1 == r5) goto L_0x003f
            if (r1 == r4) goto L_0x003b
            if (r1 != r3) goto L_0x0033
            he1.C41228o.m119483b(r10)
            goto L_0x0076
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            he1.C41228o.m119483b(r10)
            goto L_0x0092
        L_0x003f:
            java.lang.Object r8 = r9.f71330g
            rc0.a r8 = (rc0.C27990a) r8
            he1.C41228o.m119483b(r10)
            goto L_0x0087
        L_0x0047:
            java.lang.Object r8 = r9.f71330g
            rc0.a r8 = (rc0.C27990a) r8
            he1.C41228o.m119483b(r10)
            goto L_0x0062
        L_0x004f:
            he1.C41228o.m119483b(r10)
            if (r8 != 0) goto L_0x0079
            uc0.a r8 = r7.f71314b
            r9.f71330g = r7
            r9.f71333j = r6
            java.lang.Object r10 = r8.mo68440e(r9)
            if (r10 != r0) goto L_0x0061
            return r0
        L_0x0061:
            r8 = r7
        L_0x0062:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x006b
            goto L_0x007a
        L_0x006b:
            r9.f71330g = r2
            r9.f71333j = r3
            java.lang.Object r8 = r8.m86382j(r9)
            if (r8 != r0) goto L_0x0076
            return r0
        L_0x0076:
            he1.w r8 = he1.C41238w.f97225a
            return r8
        L_0x0079:
            r8 = r7
        L_0x007a:
            uc0.a r10 = r8.f71314b
            r9.f71330g = r8
            r9.f71333j = r5
            java.lang.Object r10 = r10.mo68438c(r9)
            if (r10 != r0) goto L_0x0087
            return r0
        L_0x0087:
            r9.f71330g = r2
            r9.f71333j = r4
            java.lang.Object r8 = r8.m86386n(r9)
            if (r8 != r0) goto L_0x0092
            return r0
        L_0x0092:
            he1.w r8 = he1.C41238w.f97225a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rc0.C27990a.mo47580a(boolean, ef1.d0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: b */
    public C19227a mo47581b(String str) {
        C41536l.m120489i(str, "key");
        return (C19227a) this.f71322j.get(str);
    }

    /* renamed from: c */
    public C19227a mo47582c(String str) {
        C41536l.m120489i(str, "key");
        return (C19227a) this.f71323k.get(str);
    }

    /* renamed from: d */
    public C41556a mo47583d() {
        return C41558c.m120515b(this.f71324l);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009c A[SYNTHETIC, Splitter:B:36:0x009c] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo47584e(boolean r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof rc0.C27990a.C27998h
            if (r0 == 0) goto L_0x0013
            r0 = r15
            rc0.a$h r0 = (rc0.C27990a.C27998h) r0
            int r1 = r0.f71354k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f71354k = r1
            goto L_0x0018
        L_0x0013:
            rc0.a$h r0 = new rc0.a$h
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f71352i
            java.lang.Object r10 = ne1.C41793d.m121157c()
            int r1 = r0.f71354k
            r11 = 3
            r12 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0057
            if (r1 == r2) goto L_0x004f
            if (r1 == r12) goto L_0x0040
            if (r1 != r11) goto L_0x0038
            java.lang.Object r14 = r0.f71351h
            ge.bog.mobilebank.dictionary.data.entity.DictionaryEntity r14 = (p341ge.bog.mobilebank.dictionary.data.entity.DictionaryEntity) r14
            java.lang.Object r0 = r0.f71350g
            rc0.a r0 = (rc0.C27990a) r0
            he1.C41228o.m119483b(r15)     // Catch:{ SQLiteFullException -> 0x00d2 }
            goto L_0x00bb
        L_0x0038:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0040:
            java.lang.Object r14 = r0.f71351h
            ge.bog.mobilebank.dictionary.data.entity.DictionaryEntity r14 = (p341ge.bog.mobilebank.dictionary.data.entity.DictionaryEntity) r14
            java.lang.Object r1 = r0.f71350g
            rc0.a r1 = (rc0.C27990a) r1
            he1.C41228o.m119483b(r15)     // Catch:{ SQLiteFullException -> 0x004c }
            goto L_0x00ad
        L_0x004c:
            r0 = r1
            goto L_0x00d2
        L_0x004f:
            java.lang.Object r14 = r0.f71350g
            rc0.a r14 = (rc0.C27990a) r14
            he1.C41228o.m119483b(r15)
            goto L_0x0084
        L_0x0057:
            he1.C41228o.m119483b(r15)
            if (r14 != 0) goto L_0x0065
            boolean r14 = r13.m86390r()
            if (r14 == 0) goto L_0x0065
            he1.w r14 = he1.C41238w.f97225a
            return r14
        L_0x0065:
            sc0.a r1 = r13.f71313a
            ge.bog.mobilebank.rest.manager.PreferencesApiManager r14 = r13.f71319g
            long r14 = r14.getDictionaryHashCode()
            java.lang.String r4 = r13.m86384l()
            r5 = 0
            r6 = 0
            r8 = 12
            r9 = 0
            r0.f71350g = r13
            r0.f71354k = r2
            r2 = r14
            r7 = r0
            java.lang.Object r15 = sc0.C28188a.C28189a.m86669a(r1, r2, r4, r5, r6, r7, r8, r9)
            if (r15 != r10) goto L_0x0083
            return r10
        L_0x0083:
            r14 = r13
        L_0x0084:
            ge.bog.mobilebank.dictionary.data.entity.DictionaryEntity r15 = (p341ge.bog.mobilebank.dictionary.data.entity.DictionaryEntity) r15
            ge.bog.mobilebank.rest.manager.PreferencesApiManager r1 = r14.f71319g
            long r1 = r1.getDictionaryHashCode()
            long r3 = r15.getHashCode()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x009c
            ge.bog.mobilebank.rest.manager.PreferencesApiManager r14 = r14.f71319g
            r14.updateCommonDataLastSyncDate()
            he1.w r14 = he1.C41238w.f97225a
            return r14
        L_0x009c:
            uc0.a r1 = r14.f71314b     // Catch:{ SQLiteFullException -> 0x00d1 }
            r0.f71350g = r14     // Catch:{ SQLiteFullException -> 0x00d1 }
            r0.f71351h = r15     // Catch:{ SQLiteFullException -> 0x00d1 }
            r0.f71354k = r12     // Catch:{ SQLiteFullException -> 0x00d1 }
            java.lang.Object r1 = r1.mo68438c(r0)     // Catch:{ SQLiteFullException -> 0x00d1 }
            if (r1 != r10) goto L_0x00ab
            return r10
        L_0x00ab:
            r1 = r14
            r14 = r15
        L_0x00ad:
            r0.f71350g = r1     // Catch:{ SQLiteFullException -> 0x004c }
            r0.f71351h = r14     // Catch:{ SQLiteFullException -> 0x004c }
            r0.f71354k = r11     // Catch:{ SQLiteFullException -> 0x004c }
            java.lang.Object r15 = r1.m86388p(r14, r0)     // Catch:{ SQLiteFullException -> 0x004c }
            if (r15 != r10) goto L_0x00ba
            return r10
        L_0x00ba:
            r0 = r1
        L_0x00bb:
            ge.bog.mobilebank.rest.manager.PreferencesApiManager r15 = r0.f71319g     // Catch:{ SQLiteFullException -> 0x00d2 }
            r1 = 30
            r15.setCurrentDBVersion(r1)     // Catch:{ SQLiteFullException -> 0x00d2 }
            ge.bog.mobilebank.rest.manager.PreferencesApiManager r15 = r0.f71319g     // Catch:{ SQLiteFullException -> 0x00d2 }
            long r1 = r14.getHashCode()     // Catch:{ SQLiteFullException -> 0x00d2 }
            r15.setDictionaryHashCode(r1)     // Catch:{ SQLiteFullException -> 0x00d2 }
            ge.bog.mobilebank.rest.manager.PreferencesApiManager r14 = r0.f71319g     // Catch:{ SQLiteFullException -> 0x00d2 }
            r14.updateCommonDataLastSyncDate()     // Catch:{ SQLiteFullException -> 0x00d2 }
            goto L_0x00d7
        L_0x00d1:
            r0 = r14
        L_0x00d2:
            cs.a r14 = r0.f71317e
            r14.mo48080b()
        L_0x00d7:
            he1.w r14 = he1.C41238w.f97225a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: rc0.C27990a.mo47584e(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: s */
    public final DictionaryEntity mo67553s(int i) {
        return (DictionaryEntity) this.f71320h.mo18171m(C32359z0.m95581m0(this.f71321i.getResources().openRawResource(i)), new C27997g().getType());
    }
}
