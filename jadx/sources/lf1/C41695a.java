package lf1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/* renamed from: lf1.a */
class C41695a {

    /* renamed from: a */
    private Properties f97958a;

    /* renamed from: lf1.a$b */
    private static class C41697b {

        /* renamed from: a */
        static final C41695a f97959a = new C41695a();
    }

    /* renamed from: a */
    private String m120938a(char c) {
        String property = m120940d().getProperty(Integer.toHexString(c).toUpperCase());
        if (m120942f(property)) {
            return property;
        }
        return null;
    }

    /* renamed from: c */
    static C41695a m120939c() {
        return C41697b.f97959a;
    }

    /* renamed from: d */
    private Properties m120940d() {
        return this.f97958a;
    }

    /* renamed from: e */
    private void m120941e() {
        try {
            m120943g(new Properties());
            m120940d().load(C41700d.m120950a("/pinyindb/unicode_to_hanyu_pinyin.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: f */
    private boolean m120942f(String str) {
        if (str == null || str.equals("(none0)") || !str.startsWith("(") || !str.endsWith(")")) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private void m120943g(Properties properties) {
        this.f97958a = properties;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String[] mo96500b(char c) {
        String a = m120938a(c);
        if (a == null) {
            return null;
        }
        return a.substring(a.indexOf("(") + 1, a.lastIndexOf(")")).split(",");
    }

    private C41695a() {
        this.f97958a = null;
        m120941e();
    }
}
