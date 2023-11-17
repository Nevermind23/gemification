package org.webrtc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MediaConstraints {

    /* renamed from: a */
    public final List f98829a = new ArrayList();

    /* renamed from: b */
    public final List f98830b = new ArrayList();

    /* renamed from: org.webrtc.MediaConstraints$a */
    public static class C42055a {

        /* renamed from: a */
        private final String f98831a;

        /* renamed from: b */
        private final String f98832b;

        public C42055a(String str, String str2) {
            this.f98831a = str;
            this.f98832b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C42055a aVar = (C42055a) obj;
            if (!this.f98831a.equals(aVar.f98831a) || !this.f98832b.equals(aVar.f98832b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f98831a.hashCode() + this.f98832b.hashCode();
        }

        public String toString() {
            return this.f98831a + ": " + this.f98832b;
        }
    }

    /* renamed from: a */
    private static String m122189a(List list) {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C42055a aVar = (C42055a) it.next();
            if (sb.length() > 1) {
                sb.append(", ");
            }
            sb.append(aVar.toString());
        }
        sb.append("]");
        return sb.toString();
    }

    public String toString() {
        return "mandatory: " + m122189a(this.f98829a) + ", optional: " + m122189a(this.f98830b);
    }
}
