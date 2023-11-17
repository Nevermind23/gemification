package i91;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import androidx.fragment.app.Fragment;
import g91.C32330r0;
import g91.C32359z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p543oe.C17181b;
import p557pe.C17342c;

/* renamed from: i91.c */
public class C36370c {

    /* renamed from: i */
    private static C36370c f87751i;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f87752a;

    /* renamed from: b */
    private List f87753b = null;

    /* renamed from: c */
    private List f87754c = null;

    /* renamed from: d */
    private StringBuffer f87755d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AsyncTask f87756e = null;

    /* renamed from: f */
    private C36372b f87757f = null;

    /* renamed from: g */
    private boolean f87758g = true;

    /* renamed from: h */
    private Handler f87759h = new Handler();

    /* renamed from: i91.c$a */
    class C36371a extends AsyncTask {
        C36371a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List doInBackground(Object... objArr) {
            C32359z0.m95575j0("startLoadContacts - doInBackground");
            C36370c cVar = C36370c.this;
            return cVar.m107931l(cVar.f87752a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(List list) {
            C36370c.this.m107932m(list);
            super.onPostExecute(list);
            C36370c.this.m107934p(false);
            C36370c.this.f87756e = null;
            C32359z0.m95575j0("startLoadContacts - onPostExecute");
        }
    }

    /* renamed from: i91.c$b */
    public interface C36372b {
        /* renamed from: D */
        void mo71571D();

        /* renamed from: S0 */
        void mo71576S0();
    }

    private C36370c() {
        m107928i();
    }

    /* renamed from: f */
    public static C36370c m107926f(Context context) {
        if (f87751i == null) {
            C36370c cVar = new C36370c();
            f87751i = cVar;
            cVar.f87752a = context;
        }
        return f87751i;
    }

    /* renamed from: h */
    public static boolean m107927h(Context context) {
        return C32330r0.m95338m(context, "android.permission.READ_CONTACTS");
    }

    /* renamed from: i */
    private void m107928i() {
        C32359z0.m95575j0("initContactsHelper");
        m107934p(true);
        List list = this.f87753b;
        if (list == null) {
            this.f87753b = new ArrayList();
        } else {
            list.clear();
        }
        List list2 = this.f87754c;
        if (list2 == null) {
            this.f87754c = new ArrayList();
        } else {
            list2.clear();
        }
        StringBuffer stringBuffer = this.f87755d;
        if (stringBuffer == null) {
            this.f87755d = new StringBuffer();
        } else {
            stringBuffer.delete(0, stringBuffer.length());
        }
    }

    /* renamed from: j */
    private boolean m107929j() {
        return this.f87758g;
    }

    /* renamed from: k */
    private boolean m107930k() {
        AsyncTask asyncTask = this.f87756e;
        return asyncTask != null && asyncTask.getStatus() == AsyncTask.Status.RUNNING;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0068, code lost:
        if (r1 == null) goto L_0x006d;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List m107931l(android.content.Context r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.content.ContentResolver r2 = r9.getContentResolver()     // Catch:{ Exception -> 0x0064 }
            android.net.Uri r3 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI     // Catch:{ Exception -> 0x0064 }
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r7 = "sort_key"
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0064 }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ Exception -> 0x0064 }
            r9.<init>()     // Catch:{ Exception -> 0x0064 }
        L_0x001a:
            boolean r2 = r1.moveToNext()     // Catch:{ Exception -> 0x0064 }
            if (r2 == 0) goto L_0x006a
            java.lang.String r2 = "display_name"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r2 = r1.getString(r2)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r3 = "data1"
            int r3 = r1.getColumnIndex(r3)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r4 = "photo_uri"
            int r4 = r1.getColumnIndex(r4)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r4 = r1.getString(r4)     // Catch:{ Exception -> 0x0064 }
            i91.b r5 = new i91.b     // Catch:{ Exception -> 0x0064 }
            r5.<init>(r2, r3, r4)     // Catch:{ Exception -> 0x0064 }
            oe.b r2 = r5.mo89103h()     // Catch:{ Exception -> 0x0064 }
            p557pe.C17341b.m60703d(r2)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r2 = "[^0-9.+]"
            java.lang.String r4 = ""
            java.lang.String r2 = r3.replaceAll(r2, r4)     // Catch:{ Exception -> 0x0064 }
            boolean r3 = r9.contains(r2)     // Catch:{ Exception -> 0x0064 }
            if (r3 != 0) goto L_0x005e
            r9.add(r2)     // Catch:{ Exception -> 0x0064 }
            r0.add(r5)     // Catch:{ Exception -> 0x0064 }
        L_0x005e:
            r5.mo89100d(r2)     // Catch:{ Exception -> 0x0064 }
            goto L_0x001a
        L_0x0062:
            r9 = move-exception
            goto L_0x006e
        L_0x0064:
            r9 = move-exception
            r9.printStackTrace()     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x006d
        L_0x006a:
            r1.close()
        L_0x006d:
            return r0
        L_0x006e:
            if (r1 == 0) goto L_0x0073
            r1.close()
        L_0x0073:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i91.C36370c.m107931l(android.content.Context):java.util.List");
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m107932m(List list) {
        if (list == null || list.size() < 1) {
            C36372b bVar = this.f87757f;
            if (bVar != null) {
                bVar.mo71576S0();
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C36368b bVar2 = (C36368b) it.next();
            if (!this.f87753b.contains(bVar2)) {
                this.f87753b.add(bVar2);
            }
        }
        if (this.f87757f != null) {
            mo89114o((String) null, false);
            this.f87757f.mo71571D();
        }
    }

    /* renamed from: n */
    public static void m107933n(Fragment fragment, String str) {
        new C32330r0(fragment).mo72837x(9898, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m107934p(boolean z) {
        this.f87758g = z;
    }

    /* renamed from: g */
    public List mo89113g() {
        return this.f87754c;
    }

    /* renamed from: o */
    public void mo89114o(String str, boolean z) {
        boolean z2;
        if (str == null) {
            List list = this.f87754c;
            if (list != null) {
                list.clear();
            } else {
                this.f87754c = new ArrayList();
            }
            for (C36368b bVar : this.f87753b) {
                bVar.mo89110o(0);
                bVar.mo89101f();
            }
            this.f87754c.addAll(this.f87753b);
            StringBuffer stringBuffer = this.f87755d;
            stringBuffer.delete(0, stringBuffer.length());
            Log.i("ContactsHelper", "null==search,mFirstNoSearchResultInput.length()=" + this.f87755d.length());
            return;
        }
        if (this.f87755d.length() > 0) {
            if (str.contains(this.f87755d.toString())) {
                Log.i("ContactsHelper", "no need  to search,null!=search,mFirstNoSearchResultInput.length()=" + this.f87755d.length() + "[" + this.f87755d.toString() + "];searchlen=" + str.length() + "[" + str + "]");
                return;
            }
            Log.i("ContactsHelper", "delete  mFirstNoSearchResultInput, null!=search,mFirstNoSearchResultInput.length()=" + this.f87755d.length() + "[" + this.f87755d.toString() + "];searchlen=" + str.length() + "[" + str + "]");
            StringBuffer stringBuffer2 = this.f87755d;
            stringBuffer2.delete(0, stringBuffer2.length());
        }
        List list2 = this.f87754c;
        if (list2 != null) {
            list2.clear();
        } else {
            this.f87754c = new ArrayList();
        }
        int size = this.f87753b.size();
        if (!z) {
            for (int i = 0; i < size; i++) {
                C17181b h = ((C36368b) this.f87753b.get(i)).mo89103h();
                try {
                    z2 = C17342c.m60706c(h, str);
                } catch (Exception unused) {
                    z2 = false;
                }
                if (z2) {
                    ((C36368b) this.f87753b.get(i)).mo89110o(1);
                    ((C36368b) this.f87753b.get(i)).mo89106k(h.mo44601b().toString());
                    ((C36368b) this.f87753b.get(i)).mo89108m(((C36368b) this.f87753b.get(i)).mo89097a().indexOf(h.mo44601b().toString()));
                    ((C36368b) this.f87753b.get(i)).mo89107l(((C36368b) this.f87753b.get(i)).mo89102g().length());
                    this.f87754c.add((C36368b) this.f87753b.get(i));
                } else if (((C36368b) this.f87753b.get(i)).mo89098b().contains(str)) {
                    ((C36368b) this.f87753b.get(i)).mo89110o(2);
                    ((C36368b) this.f87753b.get(i)).mo89106k(str);
                    ((C36368b) this.f87753b.get(i)).mo89108m(((C36368b) this.f87753b.get(i)).mo89098b().indexOf(str));
                    ((C36368b) this.f87753b.get(i)).mo89107l(str.length());
                    this.f87754c.add((C36368b) this.f87753b.get(i));
                }
            }
        } else {
            for (int i2 = 0; i2 < size; i2++) {
                if (((C36368b) this.f87753b.get(i2)).mo89097a().toLowerCase().contains(str.toLowerCase())) {
                    ((C36368b) this.f87753b.get(i2)).mo89110o(3);
                    ((C36368b) this.f87753b.get(i2)).mo89106k(str);
                    ((C36368b) this.f87753b.get(i2)).mo89108m(((C36368b) this.f87753b.get(i2)).mo89097a().toLowerCase().indexOf(str.toLowerCase()));
                    ((C36368b) this.f87753b.get(i2)).mo89107l(str.length());
                    this.f87754c.add((C36368b) this.f87753b.get(i2));
                } else if (((C36368b) this.f87753b.get(i2)).mo89098b().contains(str)) {
                    ((C36368b) this.f87753b.get(i2)).mo89110o(2);
                    ((C36368b) this.f87753b.get(i2)).mo89106k(str);
                    ((C36368b) this.f87753b.get(i2)).mo89108m(((C36368b) this.f87753b.get(i2)).mo89098b().indexOf(str));
                    ((C36368b) this.f87753b.get(i2)).mo89107l(str.length());
                    this.f87754c.add((C36368b) this.f87753b.get(i2));
                }
            }
        }
        if (this.f87754c.size() > 0) {
            Collections.sort(this.f87754c, C36368b.f87744i);
        } else if (this.f87755d.length() <= 0) {
            this.f87755d.append(str);
            Log.i("ContactsHelper", "no search result,null!=search,mFirstNoSearchResultInput.length()=" + this.f87755d.length() + "[" + this.f87755d.toString() + "];searchlen=" + str.length() + "[" + str + "]");
        }
    }

    /* renamed from: q */
    public void mo89115q(C36372b bVar) {
        this.f87757f = bVar;
    }

    /* renamed from: r */
    public boolean mo89116r() {
        if (m107930k()) {
            C32359z0.m95575j0("isLoading");
            return false;
        } else if (!m107929j()) {
            C32359z0.m95575j0("isContactsChanged = false");
            return false;
        } else {
            m107928i();
            this.f87756e = new C36371a().execute(new Object[0]);
            return true;
        }
    }
}
