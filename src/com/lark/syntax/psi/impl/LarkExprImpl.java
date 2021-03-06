// This is a generated file. Not intended for manual editing.
package com.lark.syntax.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.lark.syntax.psi.LarkTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.lark.syntax.psi.*;

public class LarkExprImpl extends ASTWrapperPsiElement implements LarkExpr {

  public LarkExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LarkVisitor visitor) {
    visitor.visitExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LarkVisitor) accept((LarkVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LarkAtomLitRegex getAtomLitRegex() {
    return findChildByClass(LarkAtomLitRegex.class);
  }

  @Override
  @Nullable
  public LarkAtomLitString getAtomLitString() {
    return findChildByClass(LarkAtomLitString.class);
  }

  @Override
  @Nullable
  public LarkAtomOpt getAtomOpt() {
    return findChildByClass(LarkAtomOpt.class);
  }

  @Override
  @Nullable
  public LarkAtomPar getAtomPar() {
    return findChildByClass(LarkAtomPar.class);
  }

  @Override
  @Nullable
  public LarkAtomRan getAtomRan() {
    return findChildByClass(LarkAtomRan.class);
  }

  @Override
  @Nullable
  public LarkAtomRef getAtomRef() {
    return findChildByClass(LarkAtomRef.class);
  }

}
