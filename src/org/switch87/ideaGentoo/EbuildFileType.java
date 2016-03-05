package org.switch87.ideaGentoo;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by switch87 on 5/03/16.
 */
public class EbuildFileType extends LanguageFileType {
    public static final EbuildFileType INSTANCE = new EbuildFileType();

    private EbuildFileType() {
        super(Ebuild.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Ebuild script";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Gentoo package ebuild script file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "ebuild";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return EbuildIcon.FILE;
    }
}
