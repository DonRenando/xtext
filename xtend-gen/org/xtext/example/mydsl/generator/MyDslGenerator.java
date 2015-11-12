/**
 * generated by Xtext
 */
package org.xtext.example.mydsl.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.mydsl.myDsl.Greeting;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.Reponse;
import org.xtext.example.mydsl.myDsl.ReponseF;
import org.xtext.example.mydsl.myDsl.ReponseT;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyDslGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    CharSequence _qCM = this.toQCM(((Model) _head));
    fsa.generateFile("greetings.txt", _qCM);
  }
  
  public CharSequence toQCM(final Model m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\element{general}{");
    _builder.newLine();
    {
      EList<Greeting> _greetings = m.getGreetings();
      for(final Greeting c : _greetings) {
        _builder.append("\t\t");
        _builder.append("\\begin{question}{q12}");
        _builder.newLine();
        _builder.append(" \t ");
        String _question = c.getQuestion();
        _builder.append(_question, " \t ");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("\\begin{reponses}");
        _builder.newLine();
        {
          EList<Reponse> _reponses = c.getReponses();
          for(final Reponse r : _reponses) {
            {
              if ((r instanceof ReponseT)) {
                _builder.append("    ");
                _builder.append("\\bonne{");
                String _name = ((ReponseT)r).getName();
                _builder.append(_name, "    ");
                _builder.append("}");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              if ((r instanceof ReponseF)) {
                _builder.append("\\mauvaise{");
                String _name_1 = ((ReponseF)r).getName();
                _builder.append(_name_1, "");
                _builder.append("}");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("    ");
            _builder.append("  \t");
            _builder.newLine();
          }
        }
        _builder.append("    ");
        _builder.append("\\end{reponses}");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("\\end{question}");
        _builder.newLine();
        _builder.append("}\t");
        _builder.newLine();
      }
    }
    return _builder;
  }
}