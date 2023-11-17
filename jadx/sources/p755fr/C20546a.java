package p755fr;

/* renamed from: fr.a */
public final class C20546a {
    /* JADX WARNING: type inference failed for: r5v3, types: [ge.bog.designsystem.components.common.Image] */
    /* JADX WARNING: type inference failed for: r13v15, types: [ge.bog.designsystem.components.common.Image$Url] */
    /* JADX WARNING: type inference failed for: r7v14, types: [ge.bog.designsystem.components.common.Image$Animation$Json] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0163 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x009b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00cf A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00fd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0135 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p769gr.C24776a mo49077a(l31.C37066a r24) {
        /*
            r23 = this;
            java.lang.String r0 = "commonPopup"
            r1 = r24
            kotlin.jvm.internal.C41536l.m120489i(r1, r0)
            java.lang.String r2 = r24.mo89993h()
            java.lang.String r0 = r24.mo89991f()
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r0 = g91.C32343x.m95388F(r0, r4)
            java.lang.String r4 = r24.mo89987c()
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r4 = g91.C32343x.m95388F(r4, r5)
            java.lang.String r5 = r24.mo89985a()
            r6 = 1
            if (r5 == 0) goto L_0x0034
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x002f
            r5 = r6
            goto L_0x0030
        L_0x002f:
            r5 = r3
        L_0x0030:
            if (r5 != r6) goto L_0x0034
            r5 = r6
            goto L_0x0035
        L_0x0034:
            r5 = r3
        L_0x0035:
            if (r5 == 0) goto L_0x004b
            ge.bog.designsystem.components.common.Image$Animation$Json r5 = new ge.bog.designsystem.components.common.Image$Animation$Json
            java.lang.String r8 = r24.mo89985a()
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.C41536l.m120487g(r8, r7)
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            r7 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x0077
        L_0x004b:
            ge.bog.designsystem.components.common.Image$Url r5 = new ge.bog.designsystem.components.common.Image$Url
            j31.a r7 = r24.mo89988d()
            java.lang.String r7 = r7.mo89541d()
            java.lang.String r7 = g91.C32289b0.m95091c(r7)
            if (r7 != 0) goto L_0x005e
            java.lang.String r7 = ""
            goto L_0x0063
        L_0x005e:
            java.lang.String r8 = "ImageLoader.generateImag…ternalFile.fileUrl) ?: \"\""
            kotlin.jvm.internal.C41536l.m120488h(r7, r8)
        L_0x0063:
            r14 = r7
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 126(0x7e, float:1.77E-43)
            r22 = 0
            r13 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x0077:
            java.util.List r7 = r24.mo89992g()
            java.util.Iterator r7 = r7.iterator()
        L_0x007f:
            boolean r8 = r7.hasNext()
            r9 = 0
            if (r8 == 0) goto L_0x009b
            java.lang.Object r8 = r7.next()
            r10 = r8
            l31.c r10 = (l31.C37068c) r10
            l31.d r10 = r10.mo90001a()
            l31.d r11 = l31.C37069d.ACCEPT
            if (r10 != r11) goto L_0x0097
            r10 = r6
            goto L_0x0098
        L_0x0097:
            r10 = r3
        L_0x0098:
            if (r10 == 0) goto L_0x007f
            goto L_0x009c
        L_0x009b:
            r8 = r9
        L_0x009c:
            l31.c r8 = (l31.C37068c) r8
            if (r8 == 0) goto L_0x00a5
            java.lang.String r7 = r8.mo90003c()
            goto L_0x00a6
        L_0x00a5:
            r7 = r9
        L_0x00a6:
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.String r7 = g91.C32343x.m95388F(r7, r8)
            java.util.List r8 = r24.mo89992g()
            java.util.Iterator r8 = r8.iterator()
        L_0x00b4:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x00cf
            java.lang.Object r10 = r8.next()
            r11 = r10
            l31.c r11 = (l31.C37068c) r11
            l31.d r11 = r11.mo90001a()
            l31.d r12 = l31.C37069d.ACCEPT
            if (r11 != r12) goto L_0x00cb
            r11 = r6
            goto L_0x00cc
        L_0x00cb:
            r11 = r3
        L_0x00cc:
            if (r11 == 0) goto L_0x00b4
            goto L_0x00d0
        L_0x00cf:
            r10 = r9
        L_0x00d0:
            l31.c r10 = (l31.C37068c) r10
            if (r10 == 0) goto L_0x00d9
            j31.b r8 = r10.mo90002b()
            goto L_0x00da
        L_0x00d9:
            r8 = r9
        L_0x00da:
            java.util.List r10 = r24.mo89992g()
            java.util.Iterator r10 = r10.iterator()
        L_0x00e2:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00fd
            java.lang.Object r11 = r10.next()
            r12 = r11
            l31.c r12 = (l31.C37068c) r12
            l31.d r12 = r12.mo90001a()
            l31.d r13 = l31.C37069d.CLOSE
            if (r12 != r13) goto L_0x00f9
            r12 = r6
            goto L_0x00fa
        L_0x00f9:
            r12 = r3
        L_0x00fa:
            if (r12 == 0) goto L_0x00e2
            goto L_0x00fe
        L_0x00fd:
            r11 = r9
        L_0x00fe:
            l31.c r11 = (l31.C37068c) r11
            if (r11 == 0) goto L_0x0107
            java.lang.String r10 = r11.mo90003c()
            goto L_0x0108
        L_0x0107:
            r10 = r9
        L_0x0108:
            java.lang.Object[] r11 = new java.lang.Object[r3]
            java.lang.String r10 = g91.C32343x.m95388F(r10, r11)
            boolean r11 = r24.mo89986b()
            java.util.List r12 = r24.mo89992g()
            java.util.Iterator r12 = r12.iterator()
        L_0x011a:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0135
            java.lang.Object r13 = r12.next()
            r14 = r13
            l31.c r14 = (l31.C37068c) r14
            l31.d r14 = r14.mo90001a()
            l31.d r15 = l31.C37069d.ACCEPT
            if (r14 != r15) goto L_0x0131
            r14 = r6
            goto L_0x0132
        L_0x0131:
            r14 = r3
        L_0x0132:
            if (r14 == 0) goto L_0x011a
            goto L_0x0136
        L_0x0135:
            r13 = r9
        L_0x0136:
            l31.c r13 = (l31.C37068c) r13
            if (r13 == 0) goto L_0x013f
            l31.b r12 = r13.mo90004d()
            goto L_0x0140
        L_0x013f:
            r12 = r9
        L_0x0140:
            java.util.List r1 = r24.mo89992g()
            java.util.Iterator r1 = r1.iterator()
        L_0x0148:
            boolean r13 = r1.hasNext()
            if (r13 == 0) goto L_0x0163
            java.lang.Object r13 = r1.next()
            r14 = r13
            l31.c r14 = (l31.C37068c) r14
            l31.d r14 = r14.mo90001a()
            l31.d r15 = l31.C37069d.CLOSE
            if (r14 != r15) goto L_0x015f
            r14 = r6
            goto L_0x0160
        L_0x015f:
            r14 = r3
        L_0x0160:
            if (r14 == 0) goto L_0x0148
            goto L_0x0164
        L_0x0163:
            r13 = r9
        L_0x0164:
            l31.c r13 = (l31.C37068c) r13
            if (r13 == 0) goto L_0x016e
            l31.b r1 = r13.mo90004d()
            r13 = r1
            goto L_0x016f
        L_0x016e:
            r13 = r9
        L_0x016f:
            gr.a r14 = new gr.a
            r1 = r14
            r3 = r0
            r6 = r7
            r7 = r8
            r8 = r10
            r9 = r11
            r10 = r12
            r11 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p755fr.C20546a.mo49077a(l31.a):gr.a");
    }
}
