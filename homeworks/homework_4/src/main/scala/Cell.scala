trait Cell

class EmptyCell() extends Cell{
  override def toString: String = "empty"
}

class NumberCell(value:Int) extends Cell{
  override def toString: String = value.toString
}

class StringCell(value:String) extends Cell{
  override def toString: String = value
}

class ReferenceCell(ix:Int,iy:Int,table:Table) extends Cell{
  override def toString: String = {
    val nextCell = table.getCell(ix, iy)
    nextCell match {
      case Some(cell: Cell) => cell.toString
      case Some(cell: ReferenceCell) =>
        if (cell.table.getCell(ix, iy).get == this) "cyclic"
        else cell.table.getCell(ix, iy).get.toString
      case None => "outOfRange"
    }
  }
}

