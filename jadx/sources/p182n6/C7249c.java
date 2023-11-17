package p182n6;

import android.accounts.Account;
import android.support.p013v4.media.session.C0125b;
import android.view.View;
import androidx.collection.ArraySet;
import com.google.android.gms.common.api.C3847a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p274u7.C8641a;

/* renamed from: n6.c */
public final class C7249c {

    /* renamed from: a */
    private final Account f21437a;

    /* renamed from: b */
    private final Set f21438b;

    /* renamed from: c */
    private final Set f21439c;

    /* renamed from: d */
    private final Map f21440d;

    /* renamed from: e */
    private final int f21441e;

    /* renamed from: f */
    private final View f21442f;

    /* renamed from: g */
    private final String f21443g;

    /* renamed from: h */
    private final String f21444h;

    /* renamed from: i */
    private final C8641a f21445i;

    /* renamed from: j */
    private Integer f21446j;

    /* renamed from: n6.c$a */
    public static final class C7250a {

        /* renamed from: a */
        private Account f21447a;

        /* renamed from: b */
        private ArraySet f21448b;

        /* renamed from: c */
        private String f21449c;

        /* renamed from: d */
        private String f21450d;

        /* renamed from: e */
        private C8641a f21451e = C8641a.f24412m;

        /* renamed from: a */
        public C7249c mo21627a() {
            return new C7249c(this.f21447a, this.f21448b, (Map) null, 0, (View) null, this.f21449c, this.f21450d, this.f21451e, false);
        }

        /* renamed from: b */
        public C7250a mo21628b(String str) {
            this.f21449c = str;
            return this;
        }

        /* renamed from: c */
        public final C7250a mo21629c(Collection collection) {
            if (this.f21448b == null) {
                this.f21448b = new ArraySet();
            }
            this.f21448b.addAll(collection);
            return this;
        }

        /* renamed from: d */
        public final C7250a mo21630d(Account account) {
            this.f21447a = account;
            return this;
        }

        /* renamed from: e */
        public final C7250a mo21631e(String str) {
            this.f21450d = str;
            return this;
        }
    }

    public C7249c(Account account, Set set, Map map, int i, View view, String str, String str2, C8641a aVar, boolean z) {
        Set set2;
        this.f21437a = account;
        if (set == null) {
            set2 = Collections.emptySet();
        } else {
            set2 = Collections.unmodifiableSet(set);
        }
        this.f21438b = set2;
        map = map == null ? Collections.emptyMap() : map;
        this.f21440d = map;
        this.f21442f = view;
        this.f21441e = i;
        this.f21443g = str;
        this.f21444h = str2;
        this.f21445i = aVar == null ? C8641a.f24412m : aVar;
        HashSet hashSet = new HashSet(set2);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f21439c = Collections.unmodifiableSet(hashSet);
        } else {
            C0125b.m366a(it.next());
            throw null;
        }
    }

    /* renamed from: a */
    public Account mo21615a() {
        return this.f21437a;
    }

    /* renamed from: b */
    public String mo21616b() {
        Account account = this.f21437a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    /* renamed from: c */
    public Account mo21617c() {
        Account account = this.f21437a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    /* renamed from: d */
    public Set mo21618d() {
        return this.f21439c;
    }

    /* renamed from: e */
    public Set mo21619e(C3847a aVar) {
        C0125b.m366a(this.f21440d.get(aVar));
        return this.f21438b;
    }

    /* renamed from: f */
    public String mo21620f() {
        return this.f21443g;
    }

    /* renamed from: g */
    public Set mo21621g() {
        return this.f21438b;
    }

    /* renamed from: h */
    public final C8641a mo21622h() {
        return this.f21445i;
    }

    /* renamed from: i */
    public final Integer mo21623i() {
        return this.f21446j;
    }

    /* renamed from: j */
    public final String mo21624j() {
        return this.f21444h;
    }

    /* renamed from: k */
    public final Map mo21625k() {
        return this.f21440d;
    }

    /* renamed from: l */
    public final void mo21626l(Integer num) {
        this.f21446j = num;
    }
}
