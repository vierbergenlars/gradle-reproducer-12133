package be.vbgn.gradle.reproducer.tasks;

import org.gradle.api.Task;
import org.gradle.api.file.FileCollection;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.SkipWhenEmpty;

/**
 * Created by thijs on 2/27/17.
 */
public interface WarEnrichmentTask extends Task {

    @InputFile
    @SkipWhenEmpty
    RegularFileProperty getInputWar();

    default void setInputWar(FileCollection configuration) {
        getInputWar().set(configuration::getSingleFile);
    }


}
