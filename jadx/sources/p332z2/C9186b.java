package p332z2;

/* renamed from: z2.b */
enum C9186b {
    IDLE,
    ACTIVE,
    TERMINATED,
    CANCELED;

    /* renamed from: z2.b$a */
    static class C9187a {

        /* renamed from: a */
        private final C9186b f25544a;

        private C9187a(C9186b bVar) {
            this.f25544a = bVar;
        }

        /* renamed from: b */
        static C9187a m33947b(C9186b bVar) {
            return new C9187a(bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo24792a(C9186b... bVarArr) {
            StringBuilder sb = new StringBuilder("Expected: " + this.f25544a.name() + ", but found [");
            int length = bVarArr.length;
            String str = "";
            int i = 0;
            while (i < length) {
                C9186b bVar = bVarArr[i];
                sb.append(str);
                sb.append(bVar.name());
                i++;
                str = ", ";
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
