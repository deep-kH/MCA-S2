import pymongo
con = pymongo.MongoClient("mongodb://localhost:27017/")
db = con["WinAss"]
col = db["Assonly"]
val = [{"Name":"Ass", "Age":32}, {"Name":"isho","Age":54}, {"Name":"Haroon","Age":54}]
col.insert_many(val)