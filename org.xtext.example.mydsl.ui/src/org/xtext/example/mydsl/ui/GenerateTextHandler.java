package org.xtext.example.mydsl.ui;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.util.RuntimeIOException;
import org.xtext.example.mydsl.ui.internal.MydslActivator;

import com.google.inject.Injector;

public class GenerateTextHandler implements IObjectActionDelegate {

    private IFile file;

    @Override
    public void run(IAction action) {
        if (file == null) return;

        try {
            System.out.println("✅ Running generation handler...");

            Injector injector = MydslActivator.getInstance().getInjector("org.xtext.example.mydsl.MyDsl");

            IResourceSetProvider resourceSetProvider = injector.getInstance(IResourceSetProvider.class);
            ResourceSet resourceSet = resourceSetProvider.get(file.getProject());

            URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
            Resource resource = resourceSet.getResource(uri, true);

            IGenerator2 generator = injector.getInstance(IGenerator2.class);

            // Implementación manual de IFileSystemAccess2 para evitar inyección fallida
            IFileSystemAccess2 fsa = new IFileSystemAccess2() {
                @Override
                public void generateFile(String fileName, CharSequence contents) {
                    try {
                        IFile targetFile = file.getProject().getFile(fileName);
                        byte[] bytes = contents.toString().getBytes("UTF-8");
                        ByteArrayInputStream stream = new ByteArrayInputStream(bytes);

                        if (targetFile.exists()) {
                            targetFile.setContents(stream, true, false, null);
                        } else {
                            targetFile.create(stream, true, null);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                @Override
                public void generateFile(String path, String outputCfgName, CharSequence contents) {}

                @Override
                public void deleteFile(String fileName) {}

                @Override
                public void deleteFile(String path, String outputCfgName) {}

                @Override
                public void generateFile(String path, String outputCfgName, InputStream content) {
                    try {
                        IFile targetFile = file.getProject().getFile(path);
                        if (targetFile.exists()) {
                            targetFile.setContents(content, true, false, null);
                        } else {
                            targetFile.create(content, true, null);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

				@Override
				public URI getURI(String path, String outputConfiguration) {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public URI getURI(String path) {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public void generateFile(String fileName, InputStream content) throws RuntimeIOException {
					// TODO Auto-generated method stub
					
				}

				@Override
				public InputStream readBinaryFile(String fileName, String outputCfgName) throws RuntimeIOException {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public InputStream readBinaryFile(String fileName) throws RuntimeIOException {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public CharSequence readTextFile(String fileName, String outputCfgName) throws RuntimeIOException {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public CharSequence readTextFile(String fileName) throws RuntimeIOException {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public boolean isFile(String path, String outputConfigurationName) throws RuntimeIOException {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public boolean isFile(String path) throws RuntimeIOException {
					// TODO Auto-generated method stub
					return false;
				}
            };

            generator.beforeGenerate(resource, fsa, null);
            generator.doGenerate(resource, fsa, null);
            generator.afterGenerate(resource, fsa, null);

            System.out.println("✅ File generated succesfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void selectionChanged(IAction action, ISelection selection) {
        if (selection instanceof IStructuredSelection structured && structured.getFirstElement() instanceof IFile selectedFile) {
            this.file = selectedFile;
        }
    }

    @Override
    public void setActivePart(IAction action, IWorkbenchPart targetPart) {
        // No es necesario implementar lógica adicional aquí
    }
}
