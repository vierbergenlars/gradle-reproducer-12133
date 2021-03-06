package be.vbgn.gradle.reproducer;

import be.vbgn.gradle.reproducer.tasks.InstallAmpsInWarTask;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class ReproducerPlugin implements Plugin<Project> {

    @Override
    public void apply(Project target) {
        target.getConfigurations().create("alfrescoAmp");
        InstallAmpsInWarTask task = target.getTasks().create("applyAlfrescoAmp", InstallAmpsInWarTask.class, concreteTask -> {
            concreteTask.setSourceFiles(target.getConfigurations().getByName("alfrescoAmp"));
        });
        System.out.println(task);
    }
}
