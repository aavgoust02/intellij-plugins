package org.jetbrains.training.commandsEx;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import org.jdom.Element;
import org.jetbrains.training.editor.MouseListenerHolder;
import org.jetbrains.training.lesson.Lesson;
import org.jetbrains.training.graphics.DetailPanel;

import java.util.Queue;

/**
 * Created by karashevich on 30/01/15.
 */
public class NoCommandEx extends CommandEx {

    public NoCommandEx(){
        super(CommandType.NOCOMMAND);
    }

    @Override
    public void execute(Queue<Element> elements, Lesson lesson, final Editor editor, final AnActionEvent e, Document document, String target, final DetailPanel infoPanel, MouseListenerHolder mouseListenerHolder) {
        //do nothing
    }
}
