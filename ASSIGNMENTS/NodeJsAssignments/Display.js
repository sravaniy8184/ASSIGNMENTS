const fs=require('fs');
const path = require('path');



fs.mkdir(path.join(__dirname,'/TrainingDetails'),{},function(err){
    if(err)throw err;
    console.log('')
    
})

fs.writeFile(path.join(__dirname, 'TrainingDetails', 'person.txt')
, 'I am good'
,(err)=>{
    if(err) throw err;
    console.log('file written to  ..');
});

fs.appendFile(path.join(__dirname, 'TrainingDetails', 'person.txt'),
' in playing',
err=>{
    if(err) throw err;
    console.log('File appended to . . .')
}
)

fs.readFile(path.join(__dirname, 'TrainingDetails','person.txt'), 'utf8',(err,data)=>{
    if(err)throw err;
    console.log(data);
});