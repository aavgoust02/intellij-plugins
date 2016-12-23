// This is a generated file. Not intended for manual editing.
package name.kropp.intellij.makefile.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import name.kropp.intellij.makefile.psi.MakefileRecipe;
import name.kropp.intellij.makefile.psi.MakefileRule;
import name.kropp.intellij.makefile.psi.MakefileTargetLine;
import name.kropp.intellij.makefile.psi.MakefileVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MakefileRuleImpl extends ASTWrapperPsiElement implements MakefileRule {

  public MakefileRuleImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MakefileVisitor visitor) {
    visitor.visitRule(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MakefileVisitor) accept((MakefileVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MakefileRecipe getRecipe() {
    return findChildByClass(MakefileRecipe.class);
  }

  @Override
  @NotNull
  public MakefileTargetLine getTargetLine() {
    return findNotNullChildByClass(MakefileTargetLine.class);
  }

}
