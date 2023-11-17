package com.google.protobuf;

/* renamed from: com.google.protobuf.a1 */
abstract class C5631a1 {

    /* renamed from: com.google.protobuf.a1$a */
    class C5632a implements C5633b {

        /* renamed from: a */
        final /* synthetic */ C5648f f17834a;

        C5632a(C5648f fVar) {
            this.f17834a = fVar;
        }

        /* renamed from: a */
        public byte mo18522a(int i) {
            return this.f17834a.mo18609c(i);
        }

        public int size() {
            return this.f17834a.size();
        }
    }

    /* renamed from: com.google.protobuf.a1$b */
    private interface C5633b {
        /* renamed from: a */
        byte mo18522a(int i);

        int size();
    }

    /* renamed from: a */
    static String m22443a(C5648f fVar) {
        return m22444b(new C5632a(fVar));
    }

    /* renamed from: b */
    static String m22444b(C5633b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i = 0; i < bVar.size(); i++) {
            byte a = bVar.mo18522a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a >= 32 && a <= 126) {
                            sb.append((char) a);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    static String m22445c(String str) {
        return m22443a(C5648f.m22537k(str));
    }
}
