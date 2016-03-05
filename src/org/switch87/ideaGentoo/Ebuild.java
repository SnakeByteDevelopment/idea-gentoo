package org.switch87.ideaGentoo;

/**
 * Created by switch87 on 5/03/16.
 */

import com.intellij.lang.Language;


public class Ebuild extends Language {
    public static final Ebuild INSTANCE = new Ebuild();

    private Ebuild() {
        super("Simple");
    }
}
