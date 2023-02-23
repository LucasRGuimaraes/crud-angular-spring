import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListagemComponent } from './listagem/listagem.component';
import { SharedModule } from '../shared/shared.module';



@NgModule({
  declarations: [ListagemComponent],
  imports: [
    CommonModule,
    SharedModule
  ]
})
export class ListagemModule { }
