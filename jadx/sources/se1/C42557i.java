package se1;

import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.jvm.internal.C41536l;

/* renamed from: se1.i */
public abstract class C42557i {
    /* renamed from: a */
    public static final long m123198a(Reader reader, Writer writer, int i) {
        C41536l.m120489i(reader, "<this>");
        C41536l.m120489i(writer, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += (long) read;
            read = reader.read(cArr);
        }
        return j;
    }

    /* renamed from: b */
    public static /* synthetic */ long m123199b(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m123198a(reader, writer, i);
    }

    /* renamed from: c */
    public static final String m123200c(Reader reader) {
        C41536l.m120489i(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        m123199b(reader, stringWriter, 0, 2, (Object) null);
        String stringWriter2 = stringWriter.toString();
        C41536l.m120488h(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }
}
